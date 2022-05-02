package hr.fer.oop.auditorne.aud07.toys;

public class PlasticBag<T extends Toy> extends Container<T>{

    public PlasticBag() {
        super(6000);
    }

    @Override
    public String getContainerType() {
        return "Plastic bag";
    }
}
