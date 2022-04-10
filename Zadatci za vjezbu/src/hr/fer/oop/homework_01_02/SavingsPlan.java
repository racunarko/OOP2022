package hr.fer.oop.homework_01_02;

public class SavingsPlan {
    public static void main(String[] args) {
        double startCap = Double.parseDouble(args[0]);
        double interestRate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        System.out.println("Year    Capital");
        for (int i = 1; i <= years; i++) {
            double interest = startCap * interestRate;
            startCap += interest;
            System.out.printf("%3d.%s%.2f %n", i, "    ", startCap);

        }
    }
}
