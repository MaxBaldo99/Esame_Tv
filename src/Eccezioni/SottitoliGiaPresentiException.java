package Eccezioni;

public class SottitoliGiaPresentiException extends RuntimeException {

    static final String errorMessage = "Esistono già dei sottotitoli in questa lingua";

    public SottitoliGiaPresentiException() {
        super();
    }

    public SottitoliGiaPresentiException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
