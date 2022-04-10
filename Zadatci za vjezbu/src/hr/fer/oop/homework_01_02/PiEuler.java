package hr.fer.oop.homework_01_02;

public class PiEuler {
    public static void main(String[] args) {
        double sum = 0;
        long i = 0L;
        int first5 = (int)(1e5 * Math.PI);
        int calc5 = 0;
        while (first5 != calc5) {
            i++;
            sum += 1. / (i * i);
            calc5 = (int)(1e5 * Math.sqrt(6 * sum));
            System.out.println(calc5);
        }
        System.out.printf("PI after %d steps is %f", i, Math.sqrt(6 * sum));
        int a = 20000;
        System.out.printf("\n%.20f", (double)1 / (a * a));
    }
}
