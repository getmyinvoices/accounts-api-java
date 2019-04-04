package gmi.accounts.model;

public enum PaymentMethods {
    BANK_TRANSFER("bank_transfer"),
    CASH("cash"),
    CHECK("check"),
    DIRECT_DEBIT("direct_debit"),
    CREDIT("credit"),
    CC("cc"),
    PAYPAL("paypal"),
    ONLINE_PAYMENT("online_payment"),
    AMAZON_PAY("amazon_pay"),
    APPLE_PAY("apple_pay"),
    GOOGLE_PAY("google_pay"),
    EXTERNAL_RECEIVABLES_MANAGEMENT("external_receivables_management"),
    OTHER("other")
    ;

    private final String text;

    /**
     * @param text
     */
    PaymentMethods(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
