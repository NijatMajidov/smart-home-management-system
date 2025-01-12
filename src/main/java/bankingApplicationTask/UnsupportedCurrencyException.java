package bankingApplicationTask;

public class UnsupportedCurrencyException extends RuntimeException {
    public UnsupportedCurrencyException(String message) {
        super(message);
    }
}