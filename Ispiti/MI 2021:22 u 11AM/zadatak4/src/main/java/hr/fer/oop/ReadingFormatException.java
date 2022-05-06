package hr.fer.oop;

public class ReadingFormatException extends ParseReadingException{
    public ReadingFormatException() {
    }

    public ReadingFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadingFormatException(Throwable cause) {
        super(cause);
    }
}
