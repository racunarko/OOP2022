package hr.fer.oop.samostalneVjezbe.vjezba03.zad05;

public class Vector3D extends Triple<Number> {

    public Vector3D(Number x, Number y, Number z) {
        super(x, y, z);
    }

    public static double dotProduct(Vector3D A, Vector3D B) {
        double dotProd = 0;
        for (int i = 1; i <= 3; i++) {
            dotProd += A.getElement(i).doubleValue() * B.getElement(i).doubleValue();
        }
        return dotProd;
    }
}
