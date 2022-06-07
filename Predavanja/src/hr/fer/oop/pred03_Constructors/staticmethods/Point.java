package hr.fer.oop.pred03_Constructors.staticmethods;

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

    public void print() {
        System.out.printf("(%.2f, %.2f)%n", x, y);
    }

    public boolean isEqualTo(Point other) {
        return Math.abs(x - other.x) < 1E-8 && Math.abs(y - other.y) < 1E-8;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y); /*  x = p.x;
                         *  y = p.y;
         */
    }

    public static Point centerOf(Point a, Point b, Point c) {
        double x = (a.x + b.x + c.x) / 3.;
        double y = (a.y + b.y + c.y) / 3.;
        return new Point(x, y);
    }

    public static Point centerOf(Point[] points) {
        double x = 0, y = 0;
        int len = points.length;
        for (Point p : points) {
            x += p.x;
            y += p.y;
        }
        return new Point(x / len, y / len);
    }

    public static Point centerOf(Point a, Point b, Point... points) {
        double x = a.x + b.x;
        double y = a.y + b.y;
        int len = points.length + 2;
        for (Point p : points) {
            x += p.x;
            y += p.y;
        }
        return new Point(x / len, y / len);
    }

}
