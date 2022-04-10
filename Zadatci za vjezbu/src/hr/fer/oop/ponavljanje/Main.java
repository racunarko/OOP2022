package hr.fer.oop.ponavljanje;

public class Main {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(1, 4);

        Fraction f = f1.add(f2);
        System.out.println(f);//ispisuje: 11 / 12
        f = f1.subtract(f2);
        System.out.println(f);//ispisuje: -5 / 12
        System.out.println(f2.invert().negate()); // -3/2
        f = f1.multiply(f2);
        System.out.println(f);//ispisuje: 1 / 6
        /*f = f1.divide(f2);
        System.out.println(f);//ispisuje: 3 / 8*/

        System.out.println(f1.add(f1));

        Fraction f4 = new Fraction(8, 16);
        System.out.println(f4);
    }
}
