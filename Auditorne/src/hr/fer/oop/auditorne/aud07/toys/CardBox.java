package hr.fer.oop.auditorne.aud07.toys;

public class CardBox<T extends Toy> extends Container<T>{
    public CardBox() {
        super(50000);
    }

    @Override
    public String getContainerType() {
        return "Card box";
    }
}
