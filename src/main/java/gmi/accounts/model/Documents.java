package gmi.accounts.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Documents extends CountedList<DocumentMetaData> {
    @JsonProperty("start")
    private int start;
    @JsonProperty("offset")
    private int offset;

    public Documents() {
    }

    public int getStart() {
        return start;
    }

    public int getOffset() {
        return offset;
    }
}

