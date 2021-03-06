package hr.fer.oop.homework_01_02;

import hr.fer.oop.homework_01_02.lotto.Lotto;

import java.util.Scanner;

public class LottoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balls count and the max ball value");
        int count = sc.nextInt();
        int max = sc.nextInt();

        while (count > 1 && count < max && max > 0) {
            int[] numbers = Lotto.drawA(count, max);
            print(numbers);

            System.out.println("Enter balls count ant the max ball value");
            count = sc.nextInt();
            max = sc.nextInt();
        }
    }

    private static void print(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
    }
}
