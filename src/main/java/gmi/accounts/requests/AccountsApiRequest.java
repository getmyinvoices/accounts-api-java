package gmi.accounts.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountsApiRequest {
    @JsonProperty("api_key")
    private String apiKey;

    public AccountsApiRequest(String apiKey) {
        this.apiKey = apiKey;
    }
}
