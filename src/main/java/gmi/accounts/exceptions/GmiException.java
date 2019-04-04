package gmi.accounts.exceptions;

public class GmiException extends Exception {
    private String apiError;

    public GmiException(String reasonPhrase, String apiError) {
        super(reasonPhrase + " " + apiError);
        this.apiError = apiError;
    }
}
