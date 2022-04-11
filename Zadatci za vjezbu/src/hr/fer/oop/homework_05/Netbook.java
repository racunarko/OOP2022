package hr.fer.oop.homework_05;

public final class Netbook extends Laptop {

    public Netbook(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem, batteryCapacity, weight);
    }

    @Override
    public String getComputerType() {
        return "netbook laptop computer";
    }

    @Override
    public int calculatePortabilityScore() {
        return 1;
    }
}
