package hr.fer.oop.auditorne.aud07.toys;

public class TooLittleSpace extends Exception{
    private static final long serialVersionUID = 1L;

    public TooLittleSpace(String message) {
        super(message);
    }
}
