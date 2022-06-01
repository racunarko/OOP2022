package hr.fer.oop.labosi.lab05.zad04;


class Player {
    private String name;
    private int rating;
    private double points;
    private int standing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public int getStanding() {
        return standing;
    }

    public void setStanding(int standing) {
        this.standing = standing;
    }

    //  ... GETTERI I SETTERI
    public Player(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.points = 0.0;
        this.standing = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", points=" + points +
                ", standing=" + standing +
                '}';
    }
}
