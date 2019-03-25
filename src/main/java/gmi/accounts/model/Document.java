package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {
    @JsonProperty("meta_data")
    private DocumentMetaData metaData;

    @JsonProperty("file_content")
    private String base64FileContent;

    public DocumentMetaData getMetaData() {
        return metaData;
    }

    public String getBase64FileContent() {
        return base64FileContent;
    }
}
