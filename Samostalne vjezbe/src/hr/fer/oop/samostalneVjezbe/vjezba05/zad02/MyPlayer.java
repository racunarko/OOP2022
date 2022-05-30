package hr.fer.oop.samostalneVjezbe.vjezba05.zad02;

public class MyPlayer extends Player{

    protected MyPlayer(String name) {
        super(name);
    }

    @Override
    void addGameScore(Game game, int score) {

    }

    @Override
    Iterable<Integer> getScores(Game game) {
        return null;
    }
}
