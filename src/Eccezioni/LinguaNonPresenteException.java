package Eccezioni;

public class LinguaNonPresenteException extends RuntimeException {

    static final String errorMessage = "la lingua non è presente nell'insieme delle lingue disponibili";

    public LinguaNonPresenteException() {
        super();
    }

    public LinguaNonPresenteException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
