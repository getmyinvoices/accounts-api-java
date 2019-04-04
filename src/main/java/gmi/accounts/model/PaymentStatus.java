package gmi.accounts.model;

public enum PaymentStatus {
    UNKNOWN("Unknown"),
    PAID("Paid"),
    NOT_PAID("Not paid")
    ;

    private final String text;

    /**
     * @param text
     */
    PaymentStatus(final String text) {
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
