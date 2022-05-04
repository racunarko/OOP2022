package hr.fer.oop.samostalneVjezbe.vjezba03.zad05;

public class Triple<T> {
    private T x;
    private T y;
    private T z;


    public Triple(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getElement(int select) throws IllegalArgumentException {
        if (select != 1 && select != 2 && select !=3) {
            throw new IllegalArgumentException();
        }
        switch (select) {
            case 1 -> {
                return this.x;
            }
            case 2 -> {
                return this.y;
            }
            case 3 -> {
                return this.z;
            }
            default -> {
                return null;
            }
        }
    }

    public void setElement(int select, T value) throws IllegalArgumentException {
        if (select != 1 && select != 2 && select !=3 || value == null) {
            throw new IllegalArgumentException();
        }
        switch (select) {
            case 1 -> {
                this.x = value;
            }
            case 2 -> {
                this.y = value;
            }
            case 3 -> {
                this.z = value;
            }
        }
    }

}
