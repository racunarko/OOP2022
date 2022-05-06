package hr.fer.oop;

public class IncorrectArgumentNumberException extends ParseReadingException{
    public IncorrectArgumentNumberException() {
    }

    public IncorrectArgumentNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectArgumentNumberException(Throwable cause) {
        super(cause);
    }
}
