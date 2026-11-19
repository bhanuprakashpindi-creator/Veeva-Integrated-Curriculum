package Exceptions;

public class ProductCodeAlreadyExistsException extends RuntimeException {
    public ProductCodeAlreadyExistsException(String message) {
        super(message);
    }
}
