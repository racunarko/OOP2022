package hr.fer.oop;

public class IncorrectReadingFormatException extends ParseReadingException{

    public IncorrectReadingFormatException(String message) {
        super(message);
    }

    public IncorrectReadingFormatException() {
    }

    public IncorrectReadingFormatException(Throwable cause) {
        super(cause);
    }
}
