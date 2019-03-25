package gmi.accounts.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Documents   {
    @JsonProperty("total_count")
    private int totalCount;
    @JsonProperty("start")
    private int start;
    @JsonProperty("offset")
    private int offset;
    @JsonProperty("records")
    private ArrayList<DocumentMetaData> records;

    public Documents() {
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getStart() {
        return start;
    }

    public int getOffset() {
        return offset;
    }

    public ArrayList<DocumentMetaData> getRecords() {
        return records;
    }
}

