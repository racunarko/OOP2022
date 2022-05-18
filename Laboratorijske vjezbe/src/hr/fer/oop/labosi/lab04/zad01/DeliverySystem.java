package hr.fer.oop.labosi.lab04.zad01;

import java.util.*;

class DeliverySystem {

    public static Map<String, Integer> numOfDeliveriesPerDeliveryMan(Map<String, Collection<Connection>> data) {
        // Metoda vraća broj dostava za svakog dostavljača
        TreeMap<String, Integer> deliveries = new TreeMap<>();
        for (String man : data.keySet()) {
            int count = data.get(man).size();
            deliveries.put(man, count);
        }
        return deliveries;
    }

    public static Map<String, Float> distancePerDeliveryMan(Map<String,Collection<Connection>> data) {
        // Metoda vraća ukupnu udaljenost koju je svaki dostavljač prošao
        TreeMap<String, Float> distances = new TreeMap<>();
        for (String man : data.keySet()) {
            float distance = 0;
            for (Connection obj : data.get(man)) {
                distance += obj.getDistance();
            }
            distances.put(man, distance);
        }
        return distances;
    }

}
