package hr.fer.oop.samostalneVjezbe.vjezba04.zad03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class LabTask {
    public static int count(Map<Integer, Integer> map, Set<Integer> set) {
        // Dovršiti
        int count = 0;
        Set<Integer> values = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(set.contains(entry.getValue()) && values.add(entry.getValue())) {
                count++;
            }
        }
        return count;
    }
}
