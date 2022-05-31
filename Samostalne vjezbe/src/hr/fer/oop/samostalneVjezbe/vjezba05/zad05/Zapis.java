package hr.fer.oop.samostalneVjezbe.vjezba05.zad05;

import java.util.Comparator;

class Zapis {
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
}