package hr.fer.oop.homework_10.task01;

import java.util.*;

public class Solution {

    public static List<Set<String>> groupAnagrams(List<String> words) {
        Map<String, Set<String>> groups = new HashMap<>();

        for(String word : words) {
            char[] letters = word.toLowerCase().toCharArray();
            Arrays.sort(letters);
            String sorted = new String(letters).trim();
            Set<String> group = groups.get(sorted);
            if(group == null) {
                group = new TreeSet<>();
                groups.put(sorted, group);
            }
            group.add(word);
        }

        return new ArrayList<>(groups.values());
    }
}
