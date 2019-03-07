package gmi.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountsApiRequest {
    @JsonProperty(AccountsApiMethodConstants.API_KEY)
    private String apiKey;

    public AccountsApiRequest(String apiKey) {
        this.apiKey = apiKey;
    }
}
