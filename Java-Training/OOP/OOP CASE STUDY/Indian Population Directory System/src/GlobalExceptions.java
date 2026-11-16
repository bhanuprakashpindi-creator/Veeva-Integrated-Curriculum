public class GlobalExceptions extends RuntimeException {

    public GlobalExceptions(String message) {
        super(message);
    }
    public static class  StateNotFoundException extends GlobalExceptions
    {
        public StateNotFoundException(String message)
        {
            super(message);
        }
    }
    public static class CityNotFoundException extends GlobalExceptions
    {
        public CityNotFoundException(String message)
        {
            super(message);
        }
    }
    public static class StateAlreadyExistsException extends GlobalExceptions
    {
        public  StateAlreadyExistsException(String message)
        {
            super(message);
        }
    }
    public static class CityAlreadyExistsException extends GlobalExceptions
    {
        public CityAlreadyExistsException(String message)
        {
            super(message);
        }
    }

    public static class InvalidPopulationException extends GlobalExceptions {
        public InvalidPopulationException(String message) {
            super(message);
        }
    }
}


