package hr.fer.oop.homework_11.task08;

import hr.fer.oop.homework_11.person.Person;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> result = new Sequence<>("OOP", "is", "your", "world", ".")
                .filter(s-> true)
                .map(s-> s.length())
                .toList();
        System.out.println(result);

        new Sequence<>("OOP", "is", "your", "world", ".").filter(s -> s.length() < 5).map(s -> {
            if(s.length() % 2 == 0) {
                return s + " string has an even number of characters";
            }
            return s + " string has an odd number of characters";
        }).forEach(System.out::println);

        boolean areAllVragec = new Sequence<>(Person.loadPersons()).all(p -> p.getSurname().equals("Vragec"));
        System.out.println(areAllVragec);


    }


}
