package hr.fer.oop.homework_08.e06;

import hr.fer.oop.homework_08.e01e03.KeyValueMapEntry;

public class Main {
    public static void main(String[] args) {
        KeyValueMapEntry<Integer, String> real = new KeyValueMapEntry<>(5, "Real Madrid");
        KeyValueMapEntry<Integer, String> dinamo = new KeyValueMapEntry<>(3, "Dinamo");
        //KeyValueMapEntry<Integer, Boolean> fake = new KeyValueMapEntry<>(1, false);
        //KeyValueMapEntry<Double, String> fake2 = new KeyValueMapEntry<>(1.0d, "Varazdin");
        System.out.println(calculateAverageKey(real, dinamo));//, fake, fake2)); // we cannot add fake and fake2 because their parameters are not "aligned" with parameters from "real"

    }

    public static <K extends Number, V> double calculateAverageKey(KeyValueMapEntry<K, V>... keyValueMapEntries) {
        double sum = 0;
        int count = 0;
        for(KeyValueMapEntry<K,V> e : keyValueMapEntries) {
            K key = e.getKey();
            sum = sum + key.doubleValue();
            count++;
        }
        return sum/count;
    }
}
