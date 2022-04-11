package hr.fer.oop.homework_05;

public class Desktop extends Computer{
    private double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", caseHeight=" + caseHeight;
    }
}
