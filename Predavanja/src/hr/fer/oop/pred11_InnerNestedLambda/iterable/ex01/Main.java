package hr.fer.oop.pred11_InnerNestedLambda.iterable.ex01;

public class Main {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(12345);
        for (Integer digit : number) {
            System.out.print(digit + " ");
        }
        System.out.println();
        for (Integer digit1 : number) {
            for (Integer digit2 : number) {
                System.out.printf("%d - %d \n", digit1, digit2);
            }
        }
    }
}
