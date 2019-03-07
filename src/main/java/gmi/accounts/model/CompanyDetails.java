package gmi.accounts.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import gmi.accounts.AccountsApiMethodConstants;

public class CompanyDetails extends IdResponse {
    @JsonProperty(AccountsApiMethodConstants.NAME)
    private String name;
    @JsonProperty(AccountsApiMethodConstants.COMPANY_TYPE)
    private String companyType;
    @JsonProperty(AccountsApiMethodConstants.NOTE)
    private String note;
    @JsonProperty(AccountsApiMethodConstants.TAGS)
    private String tags;
    @JsonProperty(AccountsApiMethodConstants.STREET)
    private String street;
    @JsonProperty(AccountsApiMethodConstants.ZIP)
    private String zip;
    @JsonProperty(AccountsApiMethodConstants.CITY)
    private String city;
    @JsonProperty(AccountsApiMethodConstants.EMAIL)
    private String email;
    @JsonProperty(AccountsApiMethodConstants.PHONE)
    private String phone;
    @JsonProperty(AccountsApiMethodConstants.FAX)
    private String fax;
    @JsonProperty(AccountsApiMethodConstants.TAX_NUMBER)
    private String taxNumber;
    @JsonProperty(AccountsApiMethodConstants.VAT_ID)
    private String vatID;
    @JsonProperty(AccountsApiMethodConstants.COMMERCIAL_REGISTER)
    private String commercialRegister;
    @JsonProperty(AccountsApiMethodConstants.IBAN)
    private String iban;
    @JsonProperty(AccountsApiMethodConstants.BIC)
    private String bic;
    @JsonProperty(AccountsApiMethodConstants.URL)
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
