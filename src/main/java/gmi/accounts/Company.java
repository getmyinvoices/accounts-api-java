package gmi.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company {
    @JsonProperty(AccountsApiMethodConstants.PARAM_PRIMARY_UNIQUE_ID)
    private int primaryUniqueId;
    @JsonProperty(AccountsApiMethodConstants.PARAM_NAME)
    private String name;
    @JsonProperty(AccountsApiMethodConstants.PARAM_COMPANY_TYPE)
    private String companyType;
    @JsonProperty(AccountsApiMethodConstants.PARAM_NOTE)
    private String note;
    @JsonProperty(AccountsApiMethodConstants.PARAM_TAGS)
    private String tags;

    public int getPrimaryUniqueId() {
        return primaryUniqueId;
    }

    public String getName() {
        return name;
    }

    public String getCompanyType() {
        return companyType;
    }

    public String getNote() {
        return note;
    }

    public String getTags() {
        return tags;
    }
}
