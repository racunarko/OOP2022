package hr.fer.oop.pred03.staticmethods;

public class Vector {
    private Point p;
    public Vector(Point p) {
        this.p = new Point(p);
    }
    public Vector(double x, double y) {
        this.p = new Point(x, y);
    }
    public void print() {
        p.print();
    }
}
