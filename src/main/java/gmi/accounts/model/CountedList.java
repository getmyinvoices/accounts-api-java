package gmi.accounts.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class CountedList<TListItemType>{
    @JsonProperty("total_count")
    private int totalCount;

    @JsonProperty("records")
    private ArrayList<TListItemType> records;

    public int getTotalCount() {
        return totalCount;
    }

    public ArrayList<TListItemType> getRecords() {
        return records;
    }
}
