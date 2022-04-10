package hr.fer.oop.ponavljanje;

public class Fraction {
    private int n, d;
    // jel mi treba?
    private Fraction() {
        d = 1;
    }
    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
        this.simplify();
    }

    public int getD() {
        return d;
    }

    public int getN() {
        return n;
    }

    public Fraction add(Fraction other) {
        /*Fraction f = new Fraction();
        f.n = this.n * other.d + this.d * other.n;
        f.d = this.d * other.d;
        f.simplify();
        return f;*/
        return new Fraction(this.n * other.d + this.d * other.n, this.d * other.d);
    }

    public Fraction subtract(Fraction other) {
        return this.add(other.negate());
    }

    public Fraction invert() {
        return new Fraction(d, n);
    }

    public Fraction negate() {
        return new Fraction(-n, d);
    }

    public Fraction multiply(Fraction other) {
        Fraction f = new Fraction();
        f.n = n * other.n;
        f.d = d * other.d;
        f.simplify();
        return f;
    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    private void simplify () {
        int gcd = gcd(Math.abs(n), Math.abs(d));
        if (gcd != 0) {
            n = n / gcd;
            d /= gcd;
        }

        // sto ako je minus pobjegao u nazivniku?
    }

    public String toString() {
        return n + "/" + d;
    }                   
}
