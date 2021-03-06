package gmi.accounts.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import gmi.accounts.serialization.FlexibleFloatDeserializer;

public class DocumentMetaData {
    @JsonProperty("prim_uid")
    private int primUid;
    @JsonProperty("company_uid")
    private int companyUid;
    @JsonProperty("is_ocr_completed")
    private int isOcrCompleted;

    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("note")
    private String note;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("attachments")
    private String attachments;

    @JsonProperty("document_date")
    private Date documentDate;
    @JsonProperty("document_due_date")
    private Date documentDueDate;

    @JsonDeserialize(using = FlexibleFloatDeserializer.class)
    @JsonProperty("net_amount")
    private float netAmount;
    @JsonDeserialize(using = FlexibleFloatDeserializer.class)
    @JsonProperty("gross_amount")
    private float grossAmount;
    @JsonDeserialize(using = FlexibleFloatDeserializer.class)
    @JsonProperty("vat")
    private float vat;
    @JsonDeserialize(using = FlexibleFloatDeserializer.class)
    @JsonProperty("file_size")
    private float fileSize;

    @JsonProperty("document_number")
    private String documentNumber;

    // todo enum
    @JsonProperty("document_type")
    private String documentType;
    @JsonProperty("payment_status")
    private String paymentStatus;
    @JsonProperty("source")
    private String source;
    @JsonProperty("is_archived")
    private String isArchived;

    @JsonProperty("payment_details")
    private PaymentDetails paymentDetails;

    public int getPrimUid() {
        return primUid;
    }

    public int getCompanyUid() {
        return companyUid;
    }

    public int getIsOcrCompleted() {
        return isOcrCompleted;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCurrency() {
        return currency;
    }

    public String getNote() {
        return note;
    }

    public String getFilename() {
        return filename;
    }

    public String getTags() {
        return tags;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public Date getDocumentDueDate() {
        return documentDueDate;
    }

    public float getNetAmount() {
        return netAmount;
    }

    public float getGrossAmount() {
        return grossAmount;
    }

    public float getVat() {
        return vat;
    }

    public float getFileSize() {
        return fileSize;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getSource() {
        return source;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }
}
