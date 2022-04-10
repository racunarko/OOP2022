package hr.fer.oop.homework_04.rent_a_car;

import hr.fer.oop.homework_04.Cake;

public class Vehicle {
    private String regNo;
    private String  model;
    private int year;
    private double price; // cijena unajmljivanja vozila po satu


    public Vehicle(String regNo, String model, int year, double price) {
        this.regNo = regNo;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.2f%n", regNo, model, year, price);
    }

    public double getPricePerDay() {
        return getPrice() * 24;
    }

    public final double getPricePerMonth() {
        return 30 * getPricePerDay();
    }

    public static Vehicle getNewestVehicle(Vehicle...vehicles) {
        if (vehicles == null) {
            return null;
        }
        Vehicle newest = vehicles[0];
        for (int i = 1; i < vehicles.length; i++) {
            if (newest.getYear() < vehicles[i].getYear()) {
                newest = vehicles[i];
            }
        }
        return newest;
    }

    public static void printAllVehiclesWithCargoSpaceGreaterThan (double cargoSpaceRequired, Vehicle...vehicles) {
        if(vehicles == null || cargoSpaceRequired < 0 ) {
            return;
        }
        System.out.printf("Vehicles with cargo space greater than %.1f litres: %n", cargoSpaceRequired);

       for (Vehicle v : vehicles) {
           if (v instanceof Car) {
               if(((Car) v).getCargoSpace() > cargoSpaceRequired) {
                   System.out.println(" - " + ((Car) v).getModel() + ": " + ((Car) v).getCargoSpace());
               }
           }
           if (v instanceof CargoVan) {
               if(((CargoVan) v).getMaxLoad() > cargoSpaceRequired) {
                   System.out.println(" - " + ((CargoVan) v).getModel() + ": " + ((CargoVan) v).getMaxLoad());

               }
           }
       }
    }
}