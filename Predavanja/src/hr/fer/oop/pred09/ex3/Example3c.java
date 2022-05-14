package hr.fer.oop.pred09.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example3c {
    public static void main(String[] args) {
        String[] names = {"Boris", "Anna", "Boris", "Wang", "Anna", "Li", "Chen", "Li"};

        writeInReverse(names);
    }

    public static void writeInReverse(String[] names) {
        Set<String> set = new LinkedHashSet<>();
        for (int i = names.length - 1; i >= 0; i--) {
            set.add(names[i]);
        }
        for (String element : set) {
            System.out.println(element);
        }
    }
}
