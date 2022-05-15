package hr.fer.oop.zad1;

import java.util.Arrays;

class Plane extends Aircraft{

    private int capacity;
    private int[] motorsStatus;

    Plane(String model, String dateProduced, int capacity, int[] motorsStatus) {
        super(model, dateProduced);
        this.capacity = capacity;
        this.motorsStatus = motorsStatus;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getMotorsStatus() {
        return motorsStatus;
    }

    public void setMotorsStatus(int[] motorsStatus) {
        this.motorsStatus = motorsStatus;
    }

    @Override
    public Status aircraftStatus() {
        Status out = Status.FUNCTIONAL;
        for(int i = 0; i < motorsStatus.length; i++) {
            if (motorsStatus[i] < 100) {
                out = Status.NEED_CHECK;
            }
            if (motorsStatus[i] < 80) {
                out = Status.OUT_OF_SERVICE;
                break;
            }
        }
        return out;
    }

    @Override
    public String toString() {
        return "Aircraft model " + getModel() + " is produced " + getDateProduced() + " and has " + motorsStatus.length + " motors and capacity of " + getCapacity() + ".";
    }
}
