package hr.fer.oop.pred09_Collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> names = new HashMap<>();
//        Map<String, Integer> names = new TreeMap<>();
//        Map<String, Integer> names = new LinkedHashMap<>();

        System.out.println("Enter names (quit for end): ");
        String name;
        while (!(name = sc.next()).equals("quit")) {
            Integer val = names.get(name);
            names.put(name, val == null ? 1 : val + 1);
        }

        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            System.out.format("%s occured %d time(s)\n", entry.getKey(), entry.getValue());
        }
    }
}
