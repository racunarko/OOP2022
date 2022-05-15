package hr.fer.oop;

public class FormatException extends ParseReadingException {

    public FormatException(String message) {
        super(message);
    }

    public FormatException() {
    }

    public FormatException(Throwable cause) {
        super(cause);
    }

}
