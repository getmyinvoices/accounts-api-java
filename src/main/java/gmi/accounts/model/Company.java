package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class Company {
    @JsonProperty(AccountsApiMethodConstants.PRIMARY_UNIQUE_ID)
    private int primaryUniqueId;
    @JsonProperty(AccountsApiMethodConstants.NAME)
    private String name;
    @JsonProperty(AccountsApiMethodConstants.COMPANY_TYPE)
    private String companyType;
    @JsonProperty(AccountsApiMethodConstants.NOTE)
    private String note;
    @JsonProperty(AccountsApiMethodConstants.TAGS)
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
