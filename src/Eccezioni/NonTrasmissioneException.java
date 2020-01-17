package Eccezioni;

public class NonTrasmissioneException extends RuntimeException {

    static final String errorMessage = "l'oggetto ricevuto non è una trasmissione";

    public NonTrasmissioneException() {
        super();
    }

    public NonTrasmissioneException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
