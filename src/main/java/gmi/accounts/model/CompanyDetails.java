package gmi.accounts.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class CompanyDetails extends IdResponse {
    @JsonProperty("name")
    private String name;
    @JsonProperty("company_type")
    private String companyType;
    @JsonProperty("note")
    private String note;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("street")
    private String street;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("city")
    private String city;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("tax_number")
    private String taxNumber;
    @JsonProperty("vat_id")
    private String vatID;
    @JsonProperty("commercial_register")
    private String commercialRegister;
    @JsonProperty("iban")
    private String iban;
    @JsonProperty("bic")
    private String bic;
    @JsonProperty("url")
    private String url;

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

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public String getVatID() {
        return vatID;
    }

    public String getCommercialRegister() {
        return commercialRegister;
    }

    public String getIban() {
        return iban;
    }

    public String getBic() {
        return bic;
    }

    public String getUrl() {
        return url;
    }
}
