package hr.fer.oop.pred11.iterable.nested;

import hr.fer.oop.pred11.iterable.ex01.MyNumber;

public class Main {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(12345);
        for (Integer digit : number) {
            System.out.print(digit + " ");
        }
    }
}
