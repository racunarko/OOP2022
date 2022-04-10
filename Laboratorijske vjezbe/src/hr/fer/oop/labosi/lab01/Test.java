package hr.fer.oop.labosi.lab01;

public class Test {
    public static void main(String[] args) {
        String S1 = "Java";
        String S2 = new String(S1);
        S2.toUpperCase();
        System.out.println((S1==S2) + " " + S1.equals(S2));
    }
}
