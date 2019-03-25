package gmi.accounts;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import gmi.accounts.exceptions.GmiException;
import gmi.accounts.model.Companies;
import gmi.accounts.model.CompanyDetails;
import gmi.accounts.model.Countries;
import gmi.accounts.model.Currencies;
import gmi.accounts.model.Document;
import gmi.accounts.model.Documents;

public class GmiClientTest {

    private GmiClient client;

    @Before
    public void setup() throws URISyntaxException, IOException {
        URI credentials = GmiClientTest.class.getResource("/.credentials").toURI();
        String apiKey = new String(Files.readAllBytes(Paths.get(credentials)));

        this.client = new GmiClient(apiKey);
    }

    @Test
    public void apiStatus() throws IOException, GmiException {
        boolean success = this.client.apiStatus();
        Assert.assertTrue("success should have been true. If this Test fails, there is an Problem with your Internet connection, or the api is down.", success);
    }

    @Test
    public void listCompanies() throws IOException, GmiException {
        Companies companies = this.client.listCompanies();
    }

    @Test
    public void getCompany() throws IOException, GmiException {
        CompanyDetails company = this.client.getCompany(2258664);
    }

    @Test
    public void listDocuments() throws IOException, GmiException {
        Documents documents = this.client.listDocuments();
    }

    @Test
    public void getDocument() throws IOException, GmiException {
        Document document = this.client.getDocument(3364243);
    }

    @Test
    public void uploadNewDocument() throws IOException, GmiException {
        this.client.uploadNewDocument();
    }

    @Test
    public void updateDocument() throws IOException, GmiException {
        this.client.updateDocument();
    }

    @Test
    public void getCountries() throws IOException, GmiException {
        Countries countries = this.client.getCountries();
    }

    @Test
    public void getCurrencies() throws IOException, GmiException {
        Currencies currencies = this.client.getCurrencies();
    }

    @Test
    public void addCustomCompany() throws IOException, GmiException {
        this.client.addCustomCompany();
    }

    @Test
    public void updateCustomCompany() throws IOException, GmiException {
        this.client.updateCustomCompany();
    }

    @Test
    public void deleteCustomCompany() throws IOException, GmiException {
        this.client.deleteCustomCompany();
    }

    @Test
    public void listAttachments() throws IOException, GmiException {
        this.client.listAttachments();
    }

    @Test
    public void uploadAttachment() throws IOException, GmiException {
        this.client.uploadAttachment();
    }

    @Test
    public void deleteAttachment() throws IOException, GmiException {
        this.client.deleteAttachment();
    }
}
