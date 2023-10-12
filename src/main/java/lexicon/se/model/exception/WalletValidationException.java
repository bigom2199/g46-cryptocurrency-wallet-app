package lexicon.se.model.exception;

public class WalletValidationException extends RuntimeException {
    private String paramName;
    public WalletValidationException(String message,String paramName) {
        super(message);
        this.paramName =paramName;
    }

    public WalletValidationException(String message, Throwable cause) {
        super(message, cause);

    }
    public String getParamName(){
        return paramName;
    }

}
