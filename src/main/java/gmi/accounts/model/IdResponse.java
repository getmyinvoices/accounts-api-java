package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class IdResponse {
    @JsonProperty("prim_uid")
    private int primaryUniqueId;

    public int getPrimaryUniqueId() {
        return primaryUniqueId;
    }
}
