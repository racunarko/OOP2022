package hr.fer.oop.auditorne.aud07.toys;

public class TeddyBearToy extends Toy{

    public TeddyBearToy(int volume, String name) {
        super(volume, name);
    }

    @Override
    public String getType() {
        return "Teddy bear";
    }
}
