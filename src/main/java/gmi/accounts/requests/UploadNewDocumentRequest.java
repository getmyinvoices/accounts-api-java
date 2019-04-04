package gmi.accounts.requests;

import java.time.OffsetDateTime;

import org.apache.commons.codec.binary.Base64;

import gmi.accounts.model.DocumentTypes;
import gmi.accounts.model.PaymentMethods;
import gmi.accounts.model.PaymentStatus;

public class UploadNewDocumentRequest extends DocumentRequest {

    public UploadNewDocumentRequest(String apiKey,
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
        super(apiKey,
                fileName,
                documentType,
                fileContent,
                companyID,
                documentNumber,
                documentDate,
                documentDueDate,
                paymentMethod,
                paymentStatus,
                netAmount,
                grossAmount,
                currency,
                vat,
                cashDiscountDate,
                cashDiscountValue,
                tags,
                note,
                lineItems,
                runOCR);
    }

    public static class Builder {
        private String fileName;
        private DocumentTypes documentType;
        private String fileContent;
        private int companyID;
        private String documentNumber;
        private OffsetDateTime documentDate;
        private OffsetDateTime documentDueDate;
        private PaymentMethods paymentMethod;
        private PaymentStatus paymentStatus;
        private float netAmount;
        private float grossAmount;
        private String currency;
        private int vat;
        private OffsetDateTime cashDiscountDate;
        private float cashDiscountValue;
        private String tags;
        private String note;
        private String lineItems;
        private boolean runOCR;

        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder documentType(DocumentTypes documentType) {
            this.documentType = documentType;
            return this;
        }

        public Builder fileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }

        public Builder fileContent(byte[] fileContent) {
            this.fileContent = Base64.encodeBase64String(fileContent);
            return this;
        }

        public Builder companyID(int companyID) {
            this.companyID = companyID;
            return this;
        }

        public Builder documentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }

        public Builder documentDate(OffsetDateTime documentDate) {
            this.documentDate = documentDate;
            return this;
        }

        public Builder documentDueDate(OffsetDateTime documentDueDate) {
            this.documentDueDate = documentDueDate;
            return this;
        }

        public Builder paymentMethod(PaymentMethods paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder paymentStatus(PaymentStatus paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder netAmount(float netAmount) {
            this.netAmount = netAmount;
            return this;
        }

        public Builder grossAmount(float grossAmount) {
            this.grossAmount = grossAmount;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder vat(int vat) {
            this.vat = vat;
            return this;
        }

        public Builder cashDiscountDate(OffsetDateTime cashDiscountDate) {
            this.cashDiscountDate = cashDiscountDate;
            return this;
        }

        public Builder cashDiscountValue(float cashDiscountValue) {
            this.cashDiscountValue = cashDiscountValue;
            return this;
        }

        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(String... tags) {
            this.tags = String.join(", ", tags);
            return this;
        }

        public Builder note(String note) {
            this.note = note;
            return this;
        }

        public Builder lineItems(String lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        public Builder runOCR(boolean runOCR) {
            this.runOCR = runOCR;
            return this;
        }

        public Builder(String fileName, DocumentTypes documentType) {
            this.fileName = fileName;
            this.documentType = documentType;
        }

        public UploadNewDocumentRequest Build(String apiKey) {
            return new UploadNewDocumentRequest(apiKey,
                    fileName,
                    documentType,
                    fileContent,
                    companyID,
                    documentNumber,
                    documentDate,
                    documentDueDate,
                    paymentMethod,
                    paymentStatus,
                    netAmount,
                    grossAmount,
                    currency,
                    vat,
                    cashDiscountDate,
                    cashDiscountValue,
                    tags,
                    note,
                    lineItems,
                    runOCR);
        }
    }
}
