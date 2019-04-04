package gmi.accounts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

import gmi.accounts.exceptions.GmiException;
import gmi.accounts.requests.AccountsApiRequest;
import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

public abstract class ExtendedHttpClient {

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

        while (line != null) {
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
        return objectMapper.readValue(responseBodyAsString, clazz);
    }


    <TResponse> TResponse makeRequest(String localPath, AccountsApiRequest request, Class<TResponse> clazz) throws IOException, GmiException {
        URI requestUrl = combineApiPath(localPath);
        HttpResponse response = makeRequest(requestUrl, request);
        HandleHttpError(response);
        return getResponseFromBody(response, clazz);
    }

    private URI combineApiPath(String segment) {
        return URI.create(AccountsApiMethodConstants.GMI_ACCOUNTS_URL + segment);
    }

    protected void HandleHttpError(HttpResponse httpResponse) throws GmiException {
        if (httpResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            InputStream content = null;
            String error;
            try {
                content = httpResponse.getEntity().getContent();
                byte[] data = IOUtils.readFully(content, content.available(), true);
                error = new String(data);
            } catch (IOException e) {
                error = "additionally there was a problem while trying to read the error from the http response stream. the original error message could not be recovered";
            }

            throw new GmiException(httpResponse.getStatusLine().getReasonPhrase(), error);
        }
    }
}
