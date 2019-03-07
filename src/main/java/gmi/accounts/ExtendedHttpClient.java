package gmi.accounts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class ExtendedHttpClient{

    private final ObjectMapper objectMapper;

    public ExtendedHttpClient(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    String getResponseBodyAsString(HttpResponse response) throws IOException {
        HttpEntity responseBody = response.getEntity();
        InputStream is = responseBody.getContent();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        StringBuilder result = new StringBuilder();
        line = br.readLine();

        while (line != null){
            result.append(line);
            line = br.readLine();
        }

        return result.toString();
    }

    HttpResponse makeRequest(URI requestUrl, AccountsApiRequest request) throws IOException {
        String payload = objectMapper.writeValueAsString(request);

        HttpPost httppost = new HttpPost(requestUrl);
        httppost.setEntity(new StringEntity(payload, "UTF-8"));
        httppost.setHeader("Accept", "application/json");
        httppost.setHeader("Content-type", "application/json");

        HttpClient httpclient = HttpClients.createDefault();
        return httpclient.execute(httppost);
    }

    <TResponse> TResponse getResponseFromBody(HttpResponse response, Class<TResponse> clazz) throws IOException {
        String responseBodyAsString = getResponseBodyAsString(response);
        return objectMapper.readValue(responseBodyAsString,clazz);
    }



    <TResponse> Response<TResponse> makeRequest(String localPath, AccountsApiRequest request    , Class<TResponse> clazz) throws IOException {
        URI requestUrl = combineApiPath(localPath);
        HttpResponse response = makeRequest(requestUrl, request);
        TResponse result = getResponseFromBody(response, clazz);
        return new Response<TResponse>(result, response);
    }

    private URI combineApiPath(String segment){
        return URI.create(AccountsApiMethodConstants.GMI_ACCOUNTS_URL + segment);
    }


    protected class Response<TResponse>{
        private TResponse response;
        private HttpResponse httpResponse;

        Response(TResponse response, HttpResponse httpResponse) {
            this.response = response;
            this.httpResponse = httpResponse;
        }

        TResponse getResponse() {
            return response;
        }

        HttpResponse getHttpResponse() {
            return httpResponse;
        }
    }
}
