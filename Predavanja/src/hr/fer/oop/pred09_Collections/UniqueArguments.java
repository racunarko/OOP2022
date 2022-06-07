package hr.fer.oop.pred09_Collections;

import java.util.*;

public class UniqueArguments {
    public static void main(String[] args) {
        System.out.println("Using HashSet: ");
        print(addToSet(new HashSet<String>(), args));

        System.out.println("Using TreeSet: ");
        print(addToSet(new TreeSet<String>(), args));

        System.out.println("Using LinkedHashSet: ");
        print(addToSet(new LinkedHashSet<String>(), args));
    }

    private static Set<String> addToSet(Set<String> set, String[] arr) {
        for (String element : arr) {
            set.add(element);
        }
        return set;
    }

    private static void print(Iterable<String> col) {
        for (String element : col) {
            System.out.println(element);
        }
        System.out.println();
        /*
        Iterator<String> iterator = col.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */
    }
}
