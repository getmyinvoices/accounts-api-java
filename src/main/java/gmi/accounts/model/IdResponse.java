package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class IdResponse {
    @JsonProperty(AccountsApiMethodConstants.PRIMARY_UNIQUE_ID)
    private int primaryUniqueId;

    public int getPrimaryUniqueId() {
        return primaryUniqueId;
    }
}
