package hr.fer.oop.homework_07.e03;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            throw new IllegalArgumentException("The program needs exactly 2 arguments.");
        }
        System.out.println(args[0] + " " + args[1]);
    }
}
