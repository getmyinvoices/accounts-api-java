package gmi.accounts.requests;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import gmi.accounts.model.DocumentTypes;
import gmi.accounts.model.PaymentMethods;
import gmi.accounts.model.PaymentStatus;
import gmi.accounts.serialization.FloatStringSerializer;
import gmi.accounts.serialization.SimpleDateSerializer;
import gmi.accounts.serialization.ToStringSerializer;

public abstract class DocumentRequest extends AccountsApiRequest {
    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("document_type")
    @JsonSerialize(using = ToStringSerializer.class)
    private DocumentTypes documentType; // : required(string) Document type. Possible values:

    @JsonProperty("file_content")
    private String fileContent; // : (string) File content; base64 encoded

    @JsonProperty("company_id")
    private int companyID; // : (integer) ID of company from /listCompanies 1234

    @JsonProperty("document_number")
    private String documentNumber; // : (string) Document number INV-1234

    @JsonProperty("document_date")
    @JsonSerialize(using = SimpleDateSerializer.class)
    private OffsetDateTime documentDate;

    @JsonProperty("document_due_date")
    @JsonSerialize(using = SimpleDateSerializer.class)
    private OffsetDateTime documentDueDate;

    @JsonProperty("payment_method")
    @JsonSerialize(using = ToStringSerializer.class)
    private PaymentMethods paymentMethod; // : (string) Document Payment Method. Possible values:

    @JsonProperty("payment_status")
    @JsonSerialize(using = ToStringSerializer.class)
    private PaymentStatus paymentStatus; // : (string) Document Payment Status. Possible values:

    @JsonProperty("net_amount")
    @JsonSerialize(using = FloatStringSerializer.class)
    private float netAmount; // : (string) Net amount 2000.00

    @JsonProperty("gross_amount")
    @JsonSerialize(using = FloatStringSerializer.class)
    private float grossAmount; // : (string) Gross amount 3000.00

    @JsonProperty("currency")
    private String currency; // : (string) Currency EUR

    @JsonProperty("vat")
    private int vat; // : (integer) VAT percentage 19

    @JsonProperty("cash_discount_date")
    @JsonSerialize(using = SimpleDateSerializer.class)
    private OffsetDateTime cashDiscountDate;

    @JsonProperty("cash_discount_value")
    @JsonSerialize(using = FloatStringSerializer.class)
    private float cashDiscountValue; // : (string) Cash Discount value 8.00

    @JsonProperty("tags")
    private String tags; // : (string) Tags (Comma separated tags) Hosting, Software

    @JsonProperty("note")
    private String note; // : (string) Note

    @JsonProperty("line_items")
    private String lineItems; // : (string) Line Items [{ 'description': 'HDD 4TB', 'quantity': 1, 'unit_net_price': 200.00, 'tax_percentage': 19.00, 'total_gross': 219.00 }, { 'description': 'Keyboard', 'quantity':1, 'unit_net_price': 400.00, 'tax_percentage': 19.00, 'total_gross': 419.00 }]

    @JsonProperty("runOCR")
    private boolean runOCR; // : (boolean) Use integrated OCR to fill optional params automatically

    /**
     * use the {@link UploadNewDocumentRequest.Builder} class to construct an instance of this class
     */
    DocumentRequest(String apiKey,
                    String fileName,
                    DocumentTypes documentType,
                    String fileContent,
                    int companyID,
                    String documentNumber,
                    OffsetDateTime documentDate,
                    OffsetDateTime documentDueDate,
                    PaymentMethods paymentMethod,
                    PaymentStatus paymentStatus,
                    float netAmount,
                    float grossAmount,
                    String currency,
                    int vat,
                    OffsetDateTime cashDiscountDate,
                    float cashDiscountValue,
                    String tags,
                    String note,
                    String lineItems,
                    boolean runOCR) {
        super(apiKey);

        this.fileName = fileName;
        this.documentType = documentType;
        this.fileContent = fileContent;
        this.companyID = companyID;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.documentDueDate = documentDueDate;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.netAmount = netAmount;
        this.grossAmount = grossAmount;
        this.currency = currency;
        this.vat = vat;
        this.cashDiscountDate = cashDiscountDate;
        this.cashDiscountValue = cashDiscountValue;
        this.tags = tags;
        this.note = note;
        this.lineItems = lineItems;
        this.runOCR = runOCR;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setDocumentDate(OffsetDateTime documentDate) {
        this.documentDate = documentDate;
    }

    public void setDocumentDueDate(OffsetDateTime documentDueDate) {
        this.documentDueDate = documentDueDate;
    }

    public void setPaymentMethod(PaymentMethods paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setNetAmount(float netAmount) {
        this.netAmount = netAmount;
    }

    public void setGrossAmount(float grossAmount) {
        this.grossAmount = grossAmount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public void setCashDiscountDate(OffsetDateTime cashDiscountDate) {
        this.cashDiscountDate = cashDiscountDate;
    }

    public void setCashDiscountValue(float cashDiscountValue) {
        this.cashDiscountValue = cashDiscountValue;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setLineItems(String lineItems) {
        this.lineItems = lineItems;
    }

    public void setRunOCR(boolean runOCR) {
        this.runOCR = runOCR;
    }
}
