package hr.fer.oop.samostalneVjezbe.vjezba04.zad06;

import java.util.*;

class LabTask {
    public static Map<Integer, Set<String>> underpayed(Map<String, Map<Integer, List<Integer>>> salaries) {
        //dovršiti
        Map<Integer, Map<String, Integer>> avgSalary = new HashMap<>(); // mapa u koju cu pohraniti prosjecne place po godini
        Map<Integer, Set<String>> underpaid = new HashMap<>(); // izlazna mapa

        // Prepisujem iz ulazne mapu  u mapu avgSalary (godina;radnik - prosjecna placa)
        for(String worker : salaries.keySet()) {
            for (Integer year : salaries.get(worker).keySet()) {
                int sum = 0;
                for (Integer salary : salaries.get(worker).get(year)) {
                    sum += salary;
                }
                Map<String, Integer> workerSalary = new HashMap<>();
                workerSalary.put(worker, sum / 12);
                if(avgSalary.containsKey(year)) {
                    workerSalary.putAll(avgSalary.get(year));
                }
                avgSalary.put(year, workerSalary);
            }
        }

        // Trebam naci potplacene radnike i prepisati ih u mapu underpaid

        for(Integer year : avgSalary.keySet()) {
            int avgPerYear = 0;
            for (String worker : avgSalary.get(year).keySet()) {
                avgPerYear += avgSalary.get(year).get(worker);
            }
            avgPerYear = avgPerYear / avgSalary.get(year).size();

            Set<String> workers = new HashSet<>();
            for (String worker : avgSalary.get(year).keySet()) {
                if(avgSalary.get(year).get(worker) <= avgPerYear * 0.7) {
                    workers.add(worker);
                }
            }
            underpaid.put(year, workers);

        }
        return underpaid;
    }
}
