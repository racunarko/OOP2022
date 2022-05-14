package hr.fer.oop.pred09;

import java.util.Arrays;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        // list.add(1); throws an exception
        // list.set(1, 3); throws an exception
        System.out.println(list);

        list = Arrays.asList(4, 5, 6);
        System.out.println(list);
        list.set(2, 7);
        System.out.println(list);
    }
}
