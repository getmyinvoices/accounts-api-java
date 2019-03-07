package gmi.accounts.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class AccountsApiRequest {
    @JsonProperty(AccountsApiMethodConstants.API_KEY)
    private String apiKey;

    public AccountsApiRequest(String apiKey) {
        this.apiKey = apiKey;
    }
}
