package hr.fer.oop.samostalneVjezbe.vjezba03.zad04;

abstract class Artikl<T>{
    private T tag;
    private double pricing;
    private Type type;

    public Artikl(T tag, double pricing, Type type) {
        this.tag = tag;
        this.pricing = pricing;
        this.type = type;
    }

    public T getTag() {
        return tag;
    }

    public double getPricing() {
        return pricing;
    }

    public Type getType() {
        return type;
    }

    public abstract void setQuantity(double quantity);

    public abstract double getPrice();
}