package hr.fer.oop.auditorne.aud07.toys;

public class CarToy extends Toy{

    public CarToy(int volume, String name) {
        super(volume, name);
    }

    @Override
    public String getType() {
        return "Car";
    }

}
