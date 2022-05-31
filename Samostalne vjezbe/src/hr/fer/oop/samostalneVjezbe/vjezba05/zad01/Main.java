package hr.fer.oop.samostalneVjezbe.vjezba05.zad01;

import java.util.Arrays;

import static hr.fer.oop.samostalneVjezbe.vjezba05.zad01.CollectionUtil.myFilterReduce;

public class Main {
    public static void main(String[] args) {
        System.out.println(myFilterReduce(Arrays.asList(2, 3, 6, 3),
                5,
                x->x%2==0,
                (x,y)->x*y));
        System.out.println(myFilterReduce(Arrays.asList("fer", "oop", "java", "javadoc", "javacode"),
                "both begin with j.",
                x -> x.startsWith("j"),
                (x,y) -> y + " " + x));
    }
}
