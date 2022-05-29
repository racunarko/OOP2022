package hr.fer.oop.lambda.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var gradesMap = Loader.loadData();
        String courseName = "math";
        System.out.println(gradesMap.get(courseName));
        increaseGrades(gradesMap, courseName);
        System.out.println(gradesMap.get(courseName));

        var averages = getAverageGrades(gradesMap);
        System.out.println(averages);
    }

    private static Map<String, Double> getAverageGrades(Map<String, Map<String, Integer>> gradesMap) {
        Map<String, List<Integer>> studentGrades = new HashMap<>();
        for (Map<String, Integer> courseGrades : gradesMap.values()) {
            courseGrades.forEach((student, grade) -> {
                List<Integer> listOfGrades = studentGrades.getOrDefault(student, new LinkedList<>());
                studentGrades.putIfAbsent(student, listOfGrades);
                listOfGrades.add(grade);
            });
        }
        Map<String, Double> averages = new HashMap<>();
        studentGrades.forEach((student, listOfGrades) -> {
            double sum = 0;
            for (var grade : listOfGrades) {
                sum += grade;
            }
            averages.put(student, sum / listOfGrades.size());
        });
        return averages;
     }

     private static void increaseGrades(Map<String, Map<String, Integer>> map, String courseName) {
        Map<String, Integer> courseGrades = map.get(courseName);
         for (String name : courseGrades.keySet()) {
             courseGrades.compute(name, (key, value) -> value < 5 ? value + 1 : value);
         }
     }

}
