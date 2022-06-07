package hr.fer.oop.pred04_InheritancePolymorphism.objectmethods;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        p1.print();
        Point p2 = new Point(2, 3);
        Point p3 = p2;

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

        System.out.println(p1.getX());
        Object o1 = p1; // upcast
//        System.out.println(o1.getX());
        Point po1 = (Point) o1;
        System.out.println(po1.getY());
        System.out.println(po1 == o1);
        System.out.println(po1.equals(o1));
    }
}
