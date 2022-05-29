package hr.fer.oop.lambda.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 5, 6, 7, 8, 9, 3, 10);
        for (Integer i : new SkipEven(list)) {
            System.out.println(i);
        }
    }
}
