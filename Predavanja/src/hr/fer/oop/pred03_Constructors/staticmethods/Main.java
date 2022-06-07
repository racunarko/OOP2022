package hr.fer.oop.pred03_Constructors.staticmethods;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        Point c = new Point(3, 5);
        Point center = Point.centerOf(a, b, c);
        center.print();

        Point d = new Point(7, 3);
        Point[] points = new Point[]{a, b, c, d};
        center = Point.centerOf(points);
        center.print();

        Point.centerOf(a, b).print();
        Point.centerOf(a, b, c).print();
        Point.centerOf(a, b, c, d).print();

        Vector v = new Vector(d);
        v.print();
        d.setX(17);
        d.setY(13);
        v.print();
    }
}
