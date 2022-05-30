package hr.fer.oop.homework_11.task07;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "the first second was alright but the second second was tough";
        List<String> words = List.of(s.split(" "));

        System.out.println(wordCount(words, "was", "a", "the", "second", "tough"));

        var frequencyMap = charactersFrequency("otorhinolaryngology");
        frequencyMap.forEach((Character k, Integer v) -> System.out.printf("%c = %d\n", k, v));
    }

    public static Map<String,Integer> wordCount(List<String> words, String ... lookingFor) {
        Map<String,Integer> map = new LinkedHashMap<>(); // word count map
        for (String word : lookingFor) {
            map.put(word, 0);
        }
        for (String word :words) {
            map.computeIfPresent(word, (k, v) -> v + 1);
        }
        return map;
    }

    public static Map<Character, Integer> charactersFrequency(String str) {
        Map<Character, Integer> charFreqMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character temp = str.charAt(i);

            charFreqMap.putIfAbsent(temp, 0);
            charFreqMap.computeIfPresent(temp, (k, v) -> v + 1);
//          <=>
//          charFreqMap.computeIfPresent(temp, (k, v) -> v + 1);
//          charFreqMap.putIfAbsent(temp, 1);
        }
        return charFreqMap;
    }

}
