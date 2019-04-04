package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewDocumentResponse {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("document_prim_uid")
    private int documentPrimUid;

    public boolean getSuccess() {
        return success;
    }

    public int getDocumentPrimUid() {
        return documentPrimUid;
    }
}
