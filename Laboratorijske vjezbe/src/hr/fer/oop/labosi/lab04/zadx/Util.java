package hr.fer.oop.labosi.lab04.zadx;

import java.util.HashMap;
import java.util.Map;

class Util {
    public static Map<String, Double> getExpencesPerYear(Map<Pair, Map<String, Double>> expences) {
        Map<String, Double> out = new HashMap<>();
        for(Pair pair : expences.keySet()) {
            double sum = 0;
            for(String namjena : expences.get(pair).keySet()) {
                sum += expences.get(pair).get(namjena);
            }
            double last = out.getOrDefault(pair.getYear(), (double)0);
            out.put(pair.getYear(), last + sum);
        }
        return out;
    }
}
