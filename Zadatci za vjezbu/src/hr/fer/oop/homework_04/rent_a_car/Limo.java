package hr.fer.oop.homework_04.rent_a_car;

public class Limo extends Vehicle {
    private double length;
    private boolean miniBar;
    private boolean sunRoof;

    public Limo(String regNo, String model, int year, double price, double length, boolean miniBar, boolean sunRoof) {
        super(regNo, model, year, price);
        this.length = length;
        this.miniBar = miniBar;
        this.sunRoof = sunRoof;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isMiniBar() {
        return miniBar;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    @Override
    public double getPricePerDay () {
        return 1.5 * getPrice() * 24;
    }
}
