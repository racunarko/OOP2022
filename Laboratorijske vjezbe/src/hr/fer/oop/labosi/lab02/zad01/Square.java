package hr.fer.oop.labosi.lab02.zad01;

class Square implements CalculateAreaAndBand{

    private double a;

    Square(double a) {
        this.a = Math.abs(a);
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculateBand() {
        return 4 * a;
    }
}
