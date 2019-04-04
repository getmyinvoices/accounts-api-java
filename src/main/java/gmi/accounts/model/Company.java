package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class Company {
    @JsonProperty("prim_uid")
    private int primaryUniqueId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("company_type")
    private String companyType;
    @JsonProperty("note")
    private String note;
    @JsonProperty("tags")
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
