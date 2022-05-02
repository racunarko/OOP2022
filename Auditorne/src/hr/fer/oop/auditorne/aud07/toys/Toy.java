package hr.fer.oop.auditorne.aud07.toys;

public abstract class Toy {
    private int volume;
    private String name;

    public Toy(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%s: %s (%d cm3)", getType(), getName(), getVolume());
    }
}
