package gmi.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentDetails {
    @JsonProperty("iban")
    private String iban;
    @JsonProperty("bic")
    private String bic;
    @JsonProperty("account_holder_name")
    private String accountHolderName;
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("bank_name")
    private String bankName;
    @JsonProperty("bank_address")
    private String bankAddress;
    @JsonProperty("sort_code")
    private String sortCode;
    @JsonProperty("routing_number")
    private String routingNumber;
    @JsonProperty("ifsc_code")
    private String ifscCode;
    @JsonProperty("routing_code")
    private String routingCode;
    @JsonProperty("cash_discount_date")
    private int cashDiscountDate;
    @JsonProperty("cash_discount_value")
    private String cashDiscountValue;
    @JsonProperty("sender_email")
    private String senderEmail;
    @JsonProperty("recipient_email")
    private String recipientEmail;
    @JsonProperty("transaction_id")
    private String transactionID;
    @JsonProperty("card_number")
    private String cardNumber;
    @JsonProperty("sepa_creditor_id")
    private String sepaCreditorID;
    @JsonProperty("sepa_mandate_reference")
    private String sepaMandateReference;

    public String getIban() {
        return iban;
    }

    public String getBic() {
        return bic;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getRoutingCode() {
        return routingCode;
    }

    public int getCashDiscountDate() {
        return cashDiscountDate;
    }

    public String getCashDiscountValue() {
        return cashDiscountValue;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getSepaCreditorID() {
        return sepaCreditorID;
    }

    public String getSepaMandateReference() {
        return sepaMandateReference;
    }
}
