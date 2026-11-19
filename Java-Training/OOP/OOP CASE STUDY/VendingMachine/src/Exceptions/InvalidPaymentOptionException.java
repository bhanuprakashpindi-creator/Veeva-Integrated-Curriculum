package Exceptions;

public class InvalidPaymentOptionException extends RuntimeException {
    public InvalidPaymentOptionException(String message) {
        super(message);
    }
}
