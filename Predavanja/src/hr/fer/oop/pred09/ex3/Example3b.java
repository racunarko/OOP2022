package hr.fer.oop.pred09.ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example3b {
    public static void main(String[] args) {
        String[] names = {"Boris", "Anna", "Boris", "Wang", "Anna", "Li", "Chen", "Li"};

        writeInReverse(names);
    }

    public static void writeInReverse(String[] names) {
        List<String> list = new ArrayList<>();
        // Set za provjeru ponavljaju li se imena
        Set<String> set = new HashSet<>();
        for (int i = names.length - 1; i >= 0; i--) {
            // ako uspije upisati u set, onda upisi u listu
            if (set.add(names[i])) {
                list.add(names[i]);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
