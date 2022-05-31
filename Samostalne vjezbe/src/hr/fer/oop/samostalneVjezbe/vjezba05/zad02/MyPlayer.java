package hr.fer.oop.samostalneVjezbe.vjezba05.zad02;

import java.util.*;

class MyPlayer extends Player implements Iterable<Game>{
    Map<Game, List<Integer>> allScores = new TreeMap<>(Comparator.comparing(Game::getName));

    protected MyPlayer(String name) {
        super(name);
    }

    @Override
    void addGameScore(Game game, int score) {
        allScores.putIfAbsent(game, new LinkedList<>());
        List<Integer> scores = allScores.get(game);
        scores.add(score);
    }

    @Override
    Iterable<Integer> getScores(Game game) {
        return allScores.get(game);
    }

    @Override
    public Iterator<Game> iterator() {
        return allScores.keySet().iterator();
    }
}
