package hr.fer.oop.homework_10.task01;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> input = List.of("eat", "dormitory", "TEA", "dirty room",
                "TEA", "tea", "silent", "ate", "fire", "listen");
        List<Set<String>> result = Solution.groupAnagrams(input);
        for (var group : result) {
            System.out.println(group);
        }
    }
}
