package gmi.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

class ApiStatusResponse{
    @JsonProperty(AccountsApiMethodConstants.STATUS_SUCCESS)
    private boolean success;

    public boolean getSuccess() {
        return success;
    }
}
