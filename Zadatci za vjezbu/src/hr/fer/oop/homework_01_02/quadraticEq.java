package hr.fer.oop.homework_01_02;

public class quadraticEq {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Program needs arguments for a, b, and c in ax^2 + bx = c");
            System.exit(1);
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double determinant = b * b - 4 * a * c;

        if (determinant < 0) {
            System.out.println("No solution available in R");
        } else if (determinant == 0) {
            double x = -b  / (2 * a);
            System.out.printf("x1,2 = %.3f %n", x);

        } else {
            double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double x2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.printf("x1 = %.3f , x2 = %.3f %n", x1, x2);
        }
    }

}