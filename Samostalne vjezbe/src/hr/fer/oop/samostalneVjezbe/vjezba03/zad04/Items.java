package hr.fer.oop.samostalneVjezbe.vjezba03.zad04;

public class Items<T> extends Artikl<T> {

    private double quantity;

    public Items(T tag, double pricing, Type type) {
        super(tag, pricing, type);
        this.quantity = 0;
    }

    @Override
    public void setQuantity(double quantity) throws IllegalArgumentException {
        if (quantity < 0) {
            throw new IllegalArgumentException("Negative values forbidden");
        }
        else if (quantity > 0) {
            if (super.getType() == Type.ITEM && (int)quantity != quantity) {
                throw new IllegalArgumentException("For pricing per item, the quantity cannot have decimals");
            }
            this.quantity = quantity;
        }
        else {
            this.quantity = 0;
        }
    }

    @Override
    public double getPrice() {
        double price = 0;
        if (getType() == Type.ITEM) {
            price = quantity * getPricing();
        }
        else if (getType() == Type.KG) {
            price = getPricing() * quantity / 1000;
        }
        return price;
    }
}
