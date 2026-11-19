package Exceptions;

public class InvalidProductCodeException extends RuntimeException {
    public InvalidProductCodeException(String message) {
        super(message);
    }
}
