package gmi.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

class ApiStatusResponse{
    @JsonProperty("success")
    private boolean success;

    public boolean getSuccess() {
        return success;
    }
}
