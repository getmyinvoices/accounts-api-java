package gmi.accounts;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GmiClientTest {

    private GmiClient client;

    @Before
    public void setup() throws URISyntaxException, IOException {
        URI credentials = GmiClientTest.class.getResource("/.credentials").toURI();
        String apiKey = new String(Files.readAllBytes(Paths.get(credentials)));

        this.client = new GmiClient(apiKey);
    }

    @Test
    public void status() throws IOException {
        boolean success = this.client.apiStatus();
        Assert.assertTrue("success should have been true. If this Test fails, there is an Problem with your Internet connection, or the api is down.", success);
    }

    @Test
    public void listCompanies() throws IOException {
        this.client.listCompanies();
    }
}
