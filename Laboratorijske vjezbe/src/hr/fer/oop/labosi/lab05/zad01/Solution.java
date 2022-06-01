package hr.fer.oop.labosi.lab05.zad01;

import java.util.function.Predicate;

class Solution {
    static Predicate<Superhero> superheroesFightingSupervillain(String supervillain) {
        return superhero -> superhero.getSupervillains().contains(supervillain);
    }

    static Predicate<Superhero> superheroesWithOnlyOneWordInAlias() {
        return superhero -> superhero.getAlias().split(" ").length == 1;
    }
}
