package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {
    @JsonProperty("name")
    private String name;
    @JsonProperty("currency_code")
    private String currencyCode;
}
