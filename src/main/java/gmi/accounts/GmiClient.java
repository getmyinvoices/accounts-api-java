package gmi.accounts;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import gmi.accounts.exceptions.GmiException;
import gmi.accounts.model.Companies;
import gmi.accounts.model.CompanyDetails;
import gmi.accounts.model.Countries;
import gmi.accounts.model.Currencies;
import gmi.accounts.model.Document;
import gmi.accounts.model.Documents;
import gmi.accounts.requests.AccountsApiRequest;
import gmi.accounts.requests.ListCompaniesRequest;
import gmi.accounts.requests.GetCompanyRequest;

// https://api.getmyinvoices.com/accounts/v2/doc/
public class GmiClient extends ExtendedHttpClient {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private String apiKey;

    public GmiClient(String apiKey) {
        super(OBJECT_MAPPER);
        this.apiKey = apiKey;
    }


    public boolean apiStatus() throws IOException, GmiException {
        ApiStatusResponse response = makeRequest(AccountsApiMethodConstants.METHOD_API_STATUS, new AccountsApiRequest(this.apiKey), ApiStatusResponse.class);
        return response.getSuccess();
    }

    public Companies listCompanies() throws IOException, GmiException {
        // todo filter
        return makeRequest(AccountsApiMethodConstants.METHOD_LIST_COMPANIES, new ListCompaniesRequest(this.apiKey), Companies.class);
    }

    public CompanyDetails getCompany(int companyId) throws IOException, GmiException {
        return makeRequest(AccountsApiMethodConstants.METHOD_GET_COMPANY, new GetCompanyRequest(this.apiKey, companyId), CompanyDetails.class);
    }

    public Documents listDocuments() throws IOException, GmiException {
        // todo filter
        return makeRequest(AccountsApiMethodConstants.METHOD_LIST_DOCUMENTS, new AccountsApiRequest(this.apiKey), Documents.class);
    }

    public Document getDocument(int documentId) throws IOException, GmiException {
        AccountsApiRequest request = new GetDocumentRequest(this.apiKey, documentId);
        return makeRequest(AccountsApiMethodConstants.METHOD_GET_DOCUMENT, request, Document.class);
    }

    public void uploadNewDocument() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_UPLOAD_NEW_DOCUMENT, request, Companies.class);
    }

    public void updateDocument() throws IOException, GmiException {
        AccountsApiRequest request = null;
        makeRequest(AccountsApiMethodConstants.METHOD_UPDATE_DOCUMENT, request, Companies.class);
    }

    public Countries getCountries() throws IOException, GmiException {
        AccountsApiRequest request = new AccountsApiRequest(this.apiKey);
        return makeRequest(AccountsApiMethodConstants.METHOD_GET_COUNTRIES, request, Countries.class);
    }

    public Currencies getCurrencies() throws IOException, GmiException {
        AccountsApiRequest request = new AccountsApiRequest(this.apiKey);
        return makeRequest(AccountsApiMethodConstants.METHOD_GET_CURRENCIES, request, Currencies.class);
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

