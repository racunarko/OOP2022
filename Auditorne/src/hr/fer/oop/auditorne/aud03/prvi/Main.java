package hr.fer.oop.auditorne.aud03.prvi;

import static hr.fer.oop.auditorne.aud03.prvi.PointOperations.getPointMostDistantFromOrigin;

public class Main {
    public static void main(String[] args) {
        Point t1 = new Point(1,1);
        Point t = new Point(2,2);
        Point t2 = new Point(3, 4);
        Point t3 = new Point(6, 8);

        System.out.printf("%.2f%n", t1.distanceToPoint(t));
        System.out.println(getPointMostDistantFromOrigin(t1,t2,t3,t).toString());
    }
}
