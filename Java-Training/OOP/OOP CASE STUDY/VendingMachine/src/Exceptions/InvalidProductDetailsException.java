package Exceptions;

public class InvalidProductDetailsException extends RuntimeException {
    public InvalidProductDetailsException(String message) {
        super(message);
    }
}
