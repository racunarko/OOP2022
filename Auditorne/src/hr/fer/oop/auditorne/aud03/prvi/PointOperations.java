package hr.fer.oop.auditorne.aud03.prvi;

public class PointOperations {

    public static Point getPointMostDistantFromOrigin (Point...points) {
        Point origin = new Point(0,0);
        Point mostDistantPoint = null;
        double maxDistance = 0;
        for (Point p : points) {
            double distance = p.distanceToPoint(origin);
            if (distance > maxDistance) {
                maxDistance = distance;
                mostDistantPoint = p;
            }
        }
        return mostDistantPoint;
    }
}
