package hr.fer.oop.samostalneVjezbe.vjezba05.zad02;

abstract class Player {
    private String name;

    protected Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void addGameScore(Game game, int score);

    abstract Iterable<Integer> getScores(Game game);
}