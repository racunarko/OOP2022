package hr.fer.oop.samostalneVjezbe.vjezba05.zad02;

class Factory extends Game{
    protected Factory(String name, int rating) {
        super(name);
        super.setRating(rating);
    }

    public static Game createGame(String name, int rating) {
        return new Factory(name, rating);
    }
}
