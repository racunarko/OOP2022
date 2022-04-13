package hr.fer.oop.labosi.lab02.zad01;

public class Main {
    public static void main(String[] args) {
        Square a = new Square(3);
        Rectangle b = new Rectangle(-2,4);
        RightTriangle c = new RightTriangle(3,4); //katete => hipotenuza je 5

        System.out.println(a.calculateArea());
        System.out.println(a.calculateBand());

        System.out.println(b.calculateArea());
        System.out.println(b.calculateBand());

        System.out.println(c.calculateArea());
        System.out.println(c.calculateBand());
    }
}
