package gmi.accounts.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class GetCompanyRequest extends AccountsApiRequest {

    @JsonProperty(AccountsApiMethodConstants.COMPANY_ID)
    private int companyId;

    public GetCompanyRequest(String apiKey, int companyId) {
        super(apiKey);
        this.companyId = companyId;
    }
}
