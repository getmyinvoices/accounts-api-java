package gmi.accounts;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.OffsetDateTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sun.scenario.effect.Offset;

import gmi.accounts.exceptions.GmiException;
import gmi.accounts.model.Attachments;
import gmi.accounts.model.Companies;
import gmi.accounts.model.CompanyDetails;
import gmi.accounts.model.Countries;
import gmi.accounts.model.Currencies;
import gmi.accounts.model.Document;
import gmi.accounts.model.DocumentTypes;
import gmi.accounts.model.Documents;
import gmi.accounts.model.NewDocumentResponse;
import gmi.accounts.model.PaymentMethods;
import gmi.accounts.model.PaymentStatus;
import gmi.accounts.requests.UploadNewDocumentRequest;

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
        UploadNewDocumentRequest.Builder builder = new UploadNewDocumentRequest.Builder("document-2525.pdf", DocumentTypes.INCOMING_INVOICE)
                .fileContent("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MiBiZWdpbmJmcmFuZ2UKPDAwMDA+IDwwMDAwPiA8MDAwMD4KPDAwMDE+IDwwMDA5PiBbPDAwNjQ+IDwwMDYxPiA8MDA3Mz4gPDAwMDk+IDwwMDY5PiA8MDA3ND4gPDAwNjU+IDwwMDZFPiA8MDA1ND4gXQplbmRiZnJhbmdlCmVuZGNtYXAKQ01hcE5hbWUgY3VycmVudGRpY3QgL0NNYXAgZGVmaW5lcmVzb3VyY2UgcG9wCmVuZAplbmQKZW5kc3RyZWFtCmVuZG9iago3IDAgb2JqCjw8IC9UeXBlIC9Gb250Ci9TdWJ0eXBlIC9UeXBlMAovQmFzZUZvbnQgL0RlamFWdVNlcmlmLUJvbGQKL0VuY29kaW5nIC9JZGVudGl0eS1ICi9EZXNjZW5kYW50Rm9udHMgWzE0IDAgUl0KL1RvVW5pY29kZSAxNSAwIFI+PgplbmRvYmoKMyAwIG9iago8PAovVHlwZSAvUGFnZXMKL0tpZHMgClsKNiAwIFIKXQovQ291bnQgMQovUHJvY1NldCBbL1BERiAvVGV4dCAvSW1hZ2VCIC9JbWFnZUNdCj4+CmVuZG9iagp4cmVmCjAgMTcKMDAwMDAwMDAwMCA2NTUzNSBmIAowMDAwMDAwMDA5IDAwMDAwIG4gCjAwMDAwMDAxNjMgMDAwMDAgbiAKMDAwMDAwNjY0OCAwMDAwMCBuIAowMDAwMDAwMjEyIDAwMDAwIG4gCjAwMDAwMDAzMDcgMDAwMDAgbiAKMDAwMDAwMDM0NCAwMDAwMCBuIAowMDAwMDA2NTA2IDAwMDAwIG4gCjAwMDAwMDA2NTAgMDAwMDAgbiAKMDAwMDAwMTA0NyAwMDAwMCBuIAowMDAwMDAwNDY0IDAwMDAwIG4gCjAwMDAwMDA2MzAgMDAwMDAgbiAKMDAwMDAwMTA2NiAwMDAwMCBuIAowMDAwMDAxMzMyIDAwMDAwIG4gCjAwMDAwMDU3NzIgMDAwMDAgbiAKMDAwMDAwNjAyOCAwMDAwMCBuIAowMDAwMDA1NzUxIDAwMDAwIG4gCnRyYWlsZXIKPDwKL1NpemUgMTcKL0luZm8gMSAwIFIKL1Jvb3QgMiAwIFIKPj4Kc3RhcnR4cmVmCjY3NDYKJSVFT0YK")
                .companyID(2258664)
                .documentNumber("INV-3712")
                .documentDate(OffsetDateTime.now())
                .documentDueDate(OffsetDateTime.now())
                .paymentMethod(PaymentMethods.CASH)
                .paymentStatus(PaymentStatus.UNKNOWN)
                .netAmount(2.7f)
                .grossAmount(3.0f)
                .currency("EUR")
                .vat(19)
                .cashDiscountDate(OffsetDateTime.now())
                .cashDiscountValue(0.02f)
                .tags("some", "important", "tags")
                .note("an important note")
                .lineItems(null)
                .runOCR(true);

        NewDocumentResponse newDocumentResponse = this.client.uploadNewDocument(builder);
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
        int[] ids = new int[]{3221686, 2258698, 2258691, 2258912, 2258658, 2258673, 2334392, 2258839, 2258848, 2258470, 2318343, 2251972};

        for (int id : ids) {
            Attachments attachments = this.client.listAttachments(id);
        }
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
