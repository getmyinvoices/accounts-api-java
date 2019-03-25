package gmi.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.requests.AccountsApiRequest;

public class GetDocumentRequest extends AccountsApiRequest {
    @JsonProperty("document_prim_uid")
    private final int documentId;

    public GetDocumentRequest(String apiKey, int documentId) {
        super(apiKey);
        this.documentId = documentId;
    }
}
