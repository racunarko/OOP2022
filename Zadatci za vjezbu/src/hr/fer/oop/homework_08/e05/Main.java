package hr.fer.oop.homework_08.e05;

import hr.fer.oop.homework_08.e01e03.KeyValueMapEntry;

public class Main {

    public static void main(String[] args) {
        KeyValueMapEntry<Integer, String> real = new KeyValueMapEntry<>(5, "Real Madrid");
        KeyValueMapEntry<Integer, String> dinamo = new KeyValueMapEntry<>(3, "Dinamo");
        KeyValueMapEntry<Integer, Boolean> fake = new KeyValueMapEntry<>(1, false);
        KeyValueMapEntry<Integer, Double> fake2 = new KeyValueMapEntry<>(1, 99.00);
        System.out.println(calculateAverageKey(real, dinamo, fake, fake2));
    }

    public static <K extends Number> double calculateAverageKey(KeyValueMapEntry<K, ?> ... keyValueMapEntries) {
        double sum = 0;
        int count = 0;
        for(KeyValueMapEntry<K,?> e : keyValueMapEntries) {
            K key = e.getKey();
            sum = sum + key.doubleValue();
            count++;
        }
        return sum/count;
    }
}