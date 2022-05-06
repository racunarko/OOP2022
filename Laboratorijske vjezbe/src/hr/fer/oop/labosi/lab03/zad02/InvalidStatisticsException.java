package hr.fer.oop.labosi.lab03.zad02;

class InvalidStatisticsException extends Exception{
    public InvalidStatisticsException() {
    }

    public InvalidStatisticsException(String message) {
        super(message);
    }

    public InvalidStatisticsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidStatisticsException(Throwable cause) {
        super(cause);
    }
}
