package hr.fer.oop.auditorne.aud08.zad02;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class JavelinScores {
    private List<Score> scores;

    public JavelinScores() {
        scores = new LinkedList<>();
    }

    public void add(String name, double score) {
        Score s = new Score(name, score);
        int i = 0;
        for(Score curr : scores) {
            if(score > curr.getScore()) {
                break;
            }
            i++;
        }
        scores.add(i, s);
    }

    public void printScores() {
        for (Score s : scores) {
            System.out.println(s);
        }
    }

    public void printBest() {
        var printed = new HashSet<String>();
        for (Score s : scores) {
            if (printed.add(s.getName())) {
                System.out.println(s);
            }
        }
    }
}
