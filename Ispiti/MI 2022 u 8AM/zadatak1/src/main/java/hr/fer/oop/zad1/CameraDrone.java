package hr.fer.oop.zad1;

import java.util.Arrays;

class CameraDrone extends Aircraft implements Unmanned{

    private final int range;
    private int[] qualities;

    CameraDrone(String model, String dateProduced, int range, int[] qualities) {
        super(model, dateProduced);
        this.range = range;
        this.qualities = qualities;
    }

    public int getRange() {
        return range;
    }

    public int[] getQualities() {
        return qualities;
    }

    public void setQualities(int[] qualities) {
        this.qualities = qualities;
    }

    @Override
    public Status aircraftStatus() {
        double sum = 0, avg;
        Status out = null;
        for(int i = 0; i < qualities.length; i++) {
            sum += qualities[i];
        }
        avg = sum / qualities.length;
        if(avg > 70 && avg <= 100) {
            out = Status.FUNCTIONAL;
        }
        else if (avg >= 50 && avg <= 70) {
            out = Status.NEED_CHECK;
        }
        else if (avg >= 0 && avg < 50) {
            out = Status.OUT_OF_SERVICE;
        }
        return out;
    }

    @Override
    public double coverArea(Number height) {
        return range * (Double)height;
    }

    @Override
    public String toString() {
        return String.format("Aircraft model %s is produced %s and has %d elements.", getModel(), getDateProduced(), qualities.length);
    }
}
