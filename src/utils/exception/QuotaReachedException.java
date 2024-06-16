package utils.exception;

public class QuotaReachedException extends RuntimeException {
    public QuotaReachedException(String message) {
        super(message);
    }
}