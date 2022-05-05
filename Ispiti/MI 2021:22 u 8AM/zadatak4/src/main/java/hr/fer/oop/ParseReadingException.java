package hr.fer.oop;

public abstract class ParseReadingException extends Exception{
    public ParseReadingException(String message) {
        super(message);
    }

    public ParseReadingException() {
    }

    public ParseReadingException(Throwable cause) {
        super(cause);
    }
}
