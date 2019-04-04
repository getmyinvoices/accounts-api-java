package gmi.accounts.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class GetCompanyRequest extends AccountsApiRequest {

    @JsonProperty("company_id")
    private int companyId;

    public GetCompanyRequest(String apiKey, int companyId) {
        super(apiKey);
        this.companyId = companyId;
    }
}
