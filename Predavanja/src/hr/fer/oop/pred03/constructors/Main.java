package hr.fer.oop.pred03.constructors;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(p1);
        System.out.println("p1.isEqualTo(p2) : " + p1.isEqualTo(p2));
        p1.setX(1);
        p1.setY(2);
        System.out.println("p1.isEqualTo(p2) : " + p1.isEqualTo(p2));
        p1.print();
        p2.print();
    }
}
