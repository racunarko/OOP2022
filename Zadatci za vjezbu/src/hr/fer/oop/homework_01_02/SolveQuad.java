package hr.fer.oop.homework_01_02;

import java.util.Scanner;

public class SolveQuad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("No solution available in R");
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("x1 = %.3f , x2 = %.3f %n", x1, x2);
        } else {
            double x = - b / (2 * a);
            System.out.printf("x = %.3f %n", x);
        }
    }
}
