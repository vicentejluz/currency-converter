package utils.exception;

public class MalformedRequestException extends RuntimeException {
    public MalformedRequestException(String message) {
        super(message);
    }
}