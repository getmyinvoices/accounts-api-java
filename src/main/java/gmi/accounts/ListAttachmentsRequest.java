package gmi.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.requests.AccountsApiRequest;

public class ListAttachmentsRequest extends AccountsApiRequest {
    @JsonProperty("invoice_id")
    private int invoiceId;

    public ListAttachmentsRequest(String apiKey, int invoiceId) {
        super(apiKey);
        this.invoiceId = invoiceId;
    }
}
