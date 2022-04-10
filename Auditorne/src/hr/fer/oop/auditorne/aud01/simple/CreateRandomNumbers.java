package hr.fer.oop.auditorne.aud01.simple;

public class CreateRandomNumbers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Program requires lower and upper bound");
        } else {
            int low = Integer.parseInt(args[0]);
            int high = Integer.parseInt(args[1]);
            if (low >= high) {
                System.out.println("Invalid bounds");
                System.exit(1);
            }
            int a, b;
            do {
                a = getRandomNumber(low, high);
                b = getRandomNumber(low, high);
            } while (a == b);
            System.out.printf("Two different random numbers in range [%d, %d] are %d and %d%n", low, high, a, b);
        }
    }
    public static int getRandomNumber(int from, int to) {
        return (int)(Math.random() * (to - from + 1) + from);
    }
}


