package gmi.accounts;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import gmi.accounts.exceptions.GmiException;
import gmi.accounts.model.Companies;
import gmi.accounts.model.CompanyDetails;
import gmi.accounts.requests.AccountsApiRequest;
import gmi.accounts.requests.ListCompaniesRequest;
import gmi.accounts.requests.GetCompanyRequest;

public class GmiClient extends ExtendedHttpClient {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private String apiKey;

    public GmiClient(String apiKey) {
        super(OBJECT_MAPPER);
        this.apiKey = apiKey;
    }


    public boolean apiStatus() throws IOException, GmiException {
        AccountsApiRequest request = new AccountsApiRequest(this.apiKey);
        ApiStatusResponse response = makeRequest(AccountsApiMethodConstants.METHOD_API_STATUS, request, ApiStatusResponse.class);
        return response.getSuccess();
    }

    public Companies listCompanies() throws IOException, GmiException {
        ListCompaniesRequest request = new ListCompaniesRequest(this.apiKey);
        return makeRequest(AccountsApiMethodConstants.METHOD_LIST_COMPANIES, request, Companies.class);
    }

    public CompanyDetails getCompany(int companyId) throws IOException, GmiException {
        AccountsApiRequest request = new GetCompanyRequest(this.apiKey, companyId);
        return makeRequest(AccountsApiMethodConstants.METHOD_GET_COMPANY, request, CompanyDetails.class);
    }

    public void listDocuments() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_LIST_DOCUMENTS, request, Companies.class);
    }

    public void getDocument() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_GET_DOCUMENT, request, Companies.class);
    }

    public void uploadNewDocument() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_UPLOAD_NEW_DOCUMENT, request, Companies.class);
    }

    public void updateDocument() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_UPDATE_DOCUMENT, request, Companies.class);
    }

    public void getCountries() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_GET_COUNTRIES, request, Companies.class);
    }

    public void getCurrencies() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_GET_CURRENCIES, request, Companies.class);
    }

    public void addCustomCompany() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_ADD_CUSTOM_COMPANY, request, Companies.class);
    }

    public void updateCustomCompany() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_UPDATE_CUSTOM_COMPANY, request, Companies.class);
    }

    public void deleteCustomCompany() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_DELETE_CUSTOM_COMPANY, request, Companies.class);
    }

    public void listAttachments() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_LIST_ATTACHMENTS, request, Companies.class);
    }


    public void uploadAttachment() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_UPLOAD_ATTACHMENT, request, Companies.class);
    }

    public void deleteAttachment() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_DELETE_ATTACHMENT, request, Companies.class);
    }
}

