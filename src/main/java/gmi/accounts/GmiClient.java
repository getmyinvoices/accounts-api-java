package gmi.accounts;

import java.io.IOException;

import org.apache.http.HttpStatus;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GmiClient extends ExtendedHttpClient {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private String apiKey;

    public GmiClient(String apiKey) {
        super(OBJECT_MAPPER);
        this.apiKey = apiKey;
    }


    public boolean apiStatus() throws IOException {
        AccountsApiRequest request = new AccountsApiRequest(this.apiKey);
        Response<ApiStatusResponse> response = makeRequest(AccountsApiMethodConstants.METHOD_API_STATUS, request, ApiStatusResponse.class);

        if (response.getHttpResponse().getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            // todo logging?
            return false;
        }

        return response.getResponse().getSuccess();
    }

    public Companies listCompanies() throws IOException {
        ListCompaniesRequest request = new ListCompaniesRequest(this.apiKey);
        Response<Companies> response = makeRequest(AccountsApiMethodConstants.METHOD_LIST_COMPANIES, request, Companies.class);

        if (response.getHttpResponse().getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            // todo error handling
            return null;
        }

        return response.getResponse();
    }
}

