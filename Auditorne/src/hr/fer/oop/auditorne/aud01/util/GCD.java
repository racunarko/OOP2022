package hr.fer.oop.auditorne.aud01.util;

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
