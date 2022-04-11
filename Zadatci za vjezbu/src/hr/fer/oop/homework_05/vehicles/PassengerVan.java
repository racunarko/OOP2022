package hr.fer.oop.homework_05.vehicles;

public class PassengerVan extends Van {
    private int noOfPassengers;

    public PassengerVan(String registrationNo, String model, double height, int noOfPassengers) {
        super(registrationNo, model, height);
        this.noOfPassengers = noOfPassengers;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + ", noOfPassengers=" + noOfPassengers;
    }
}
