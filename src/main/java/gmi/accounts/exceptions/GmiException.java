package gmi.accounts.exceptions;

public class GmiException extends Exception {
    public GmiException(String reasonPhrase) {
        super(reasonPhrase);
    }
}
