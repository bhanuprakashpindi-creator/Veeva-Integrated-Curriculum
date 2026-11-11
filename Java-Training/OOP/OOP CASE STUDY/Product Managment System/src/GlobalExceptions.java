public class GlobalExceptions extends RuntimeException{

    public GlobalExceptions(String message)
    {
        super(message);
    }

    public static class QuantityException extends RuntimeException {
        public QuantityException(String message) {
            super(message);
        }
    }
}
