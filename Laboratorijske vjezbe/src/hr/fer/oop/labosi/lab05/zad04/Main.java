package hr.fer.oop.labosi.lab05.zad04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Match> matches = new ArrayList();
        Map<String, Player> mplayers = new HashMap();

        mplayers.put("Caruana", new Player("Caruana", 2820));
        mplayers.put("Carlsen", new Player("Carlsen", 2847));
        mplayers.put("Radjabov", new Player("Radjabov", 2765));
        matches.add(new Match("Carlsen", "Radjabov", Result.RESULT_WHITE_WIN));
        matches.add(new Match("Caruana", "Carlsen", Result.RESULT_BLACK_WIN));
        matches.add(new Match("Caruana", "Radjabov", Result.RESULT_DRAW));

        matches.forEach(match -> {
            Player white = mplayers.get(match.getWhitePlayer());
            Player black = mplayers.get(match.getBlackPlayer());
            if(match.getResult() == Result.RESULT_WHITE_WIN) {
                white.setPoints(white.getPoints() + 1);
            } else if (match.getResult() == Result.RESULT_BLACK_WIN) {
                black.setPoints(white.getPoints() + 1);
            } else if (match.getResult() == Result.RESULT_DRAW) {
                white.setPoints(white.getPoints() + 0.5);
                black.setPoints(black.getPoints() + 0.5);
            }
        });
        System.out.println(mplayers);
    }

}
