package hr.fer.oop.homework_10.task02;

import hr.fer.oop.homework_10.task01.Solution;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word per line. Type QUIT to exit: ");
        List<String> words = new LinkedList<>();
        while(sc.hasNextLine()) {
            String word = sc.nextLine();
            if (word.equalsIgnoreCase("quit")) {
                break;
            }
            words.add(word);
        }

        List<Set<String>> groups = Solution.groupAnagrams(words);
        try(Writer writer = new FileWriter("anagramsNOLINESEPARATOR.txt", StandardCharsets.UTF_8, true)) {
            for (Set<String> group : groups) {
                String s = String.join(";", group);
                writer.write(s);
                writer.write(System.lineSeparator());
            }
        }
        System.out.println(groups);
    }
}
