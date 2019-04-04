package gmi.accounts.model;

public enum DocumentTypes {
    INCOMING_INVOICE("INCOMING_INVOICE"),
    RECEIPT("RECEIPT"),
    PAYMENT_RECEIPT("PAYMENT_RECEIPT"),
    EXPENSE_REIMBURSEMENT("EXPENSE_REIMBURSEMENT"),
    SALES_INVOICE("SALES_INVOICE"),
    CREDIT_NOTE("CREDIT_NOTE"),
    STATEMENT("STATEMENT"),
    DELIVERY_NOTE("DELIVERY_NOTE"),
    ORDER_CONFIRMATION("ORDER_CONFIRMATION"),
    PAYROLL("PAYROLL"),
    COMPANY_REGISTRATION_DOCUMENT("COMPANY_REGISTRATION_DOCUMENT"),
    MISC("MISC"),
    TRAVEL_EXPENSES("TRAVEL_EXPENSES")
    ;

    private final String text;

    /**
     * @param text
     */
    DocumentTypes(final String text) {
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
