package hr.fer.oop.labosi.lab02.zad01;

class RightTriangle implements CalculateAreaAndBand {
    private double a;
    private double b;
    private double c;

    RightTriangle(double a, double b) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public double calculateArea() {
        return (a * b) / 2;
    }

    @Override
    public double calculateBand() {
        return a + b + c;
    }
}
