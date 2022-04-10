package hr.fer.oop.homework_04.rent_a_car;

public class CargoVan extends Van {
    private double maxLoad;

    public CargoVan(String regNo, String model, int year, double price, double height, int noOfSeats, double maxLoad) {
        super(regNo, model, year, price, height, noOfSeats);
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public double getPricePerDay () {
        return 1.1 * getPrice() * 24;
    }

}
