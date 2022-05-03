package hr.fer.oop.samostalneVjezbe.vjezba03.zad03;

public class AlcBeverage extends Beverage {
    private double alc;

    public AlcBeverage(String sku, String name, double price, double volume, double alc) {
        super(sku, name, price, volume);
        this.alc = alc;
    }

    public String getItemType() {
        return "AlcBeverage";
    }

    public double getAlc() {
        return alc;
    }

    public void setAlc(double alc) {
        this.alc = alc;
    }
}