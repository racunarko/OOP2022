package hr.fer.oop.homework_04.rent_a_car;

public class Car extends Vehicle{
    private String carType;
    private double cargoSpace;

    public Car(String regNo, String model, int year, double price, String carType, double cargoSpace) {
        super(regNo, model, year, price);
        this.carType = carType;
        this.cargoSpace = cargoSpace;
    }

    public double getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(double cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public double getPricePerDay () {
        return getPrice() * 24;
    }
}
