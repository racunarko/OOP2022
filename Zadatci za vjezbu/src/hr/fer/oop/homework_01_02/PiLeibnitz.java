package hr.fer.oop.homework_01_02;

public class PiLeibnitz {
    public static void main(String[] args) {
        double sum = 0;
        long nextPowerOf10 = 10L;
        for (long i = 0; i <= 100000000L; i++) {
            if (i % 2 == 0) {
                sum += 1. / (2 * i + 1);
            }
            else {
                sum -= 1. / (2 * i + 1);
            }
            if (i == nextPowerOf10) {
                System.out.printf("Vrijednost Pi nakon %d sumanada je %.10f %n", i, 4 * sum);
                nextPowerOf10 *= 10L;
            }
        }
    }
}
