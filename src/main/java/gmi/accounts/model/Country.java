package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import gmi.accounts.serialization.BooleanFromBinaryStringDeserializer;

public class Country {
    @JsonProperty("prim_uid")
    private int primUid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("vat")
    private int vat;
    @JsonDeserialize(using = BooleanFromBinaryStringDeserializer.class)
    @JsonProperty("is_eu")
    private boolean isEu;

    public int getPrimUid() {
        return primUid;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getVat() {
        return vat;
    }

    public boolean isEu() {
        return isEu;
    }
}
