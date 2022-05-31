package hr.fer.oop.samostalneVjezbe.vjezba05.zad05;

class Zapis implements Comparable<Zapis>{
    String ime;
    Integer bodovi;

    public String toString() {
        return this.ime + ":" + this.bodovi;
    }

    // Dovršiti
    public Zapis(String ime, Integer bodovi) {
        this.ime = ime;
        this.bodovi = bodovi;
    }
    @Override
    public int compareTo(Zapis o) {
        return this.ime.compareTo(o.ime);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Zapis other)) return false;
        return this.ime.equals(other.ime);
    }
}