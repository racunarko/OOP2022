package hr.fer.oop.pred04_InheritancePolymorphism.objectmethods;

public class Point {

    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public void print() {
        System.out.printf("(%.2f, %.2f)%n", x, y);
    }

    public boolean isEqualTo(Point other) {
        return  Math.abs(this.x - other.x) < 10E-8
                &&
                Math.abs(this.y - other.y) < 10E-8;
    }
}
