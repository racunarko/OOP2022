package hr.fer.oop.labosi.lab02.zad01;

class Rectangle implements CalculateAreaAndBand{

    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculateBand() {
        return 2 * a + 2 * b;
    }
}
