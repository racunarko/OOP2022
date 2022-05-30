package hr.fer.oop.homework_11.task06;

import hr.fer.oop.homework_11.person.*;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Person.loadPersons();
        persons.forEach(p -> System.out.println(p));
        System.out.println();

        // Comparator<Person> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Person> comparator = Comparator.comparing(Person::getName);
        persons.sort(comparator.reversed());
        persons.forEach(System.out::println);
        System.out.println();

        persons.removeIf(person -> person.getName().charAt(0) == 'S');
        persons.forEach(System.out::println);
        System.out.println();

        Map<Integer, String> map = convertIterablePersonsToMap(persons);
        System.out.println(map);
        System.out.println();

        Map<Integer, String> map1 = convertIterableToMap(persons, Person::getId, p -> String.format("%s %s", p.getName(), p.getSurname()));
        map1.forEach((k, v) -> System.out.println("{" + k + "=" + v + "}"));
    }

    static Map<Integer, String> convertIterablePersonsToMap(Iterable<? extends Person> persons) {
            Map<Integer, String> map = new HashMap<>();
        for (Person p : persons) {
            map.put(p.getId(), String.format("%s %s", p.getName(), p.getSurname()));
        }
        return map;
    }

    static <K,V,E> Map<K,V> convertIterableToMap(Iterable<? extends E> elements, Function<E,K> keyFunction, Function<E,V> valueFunction) {
        Map<K,V> map = new HashMap<>();
        for (E element : elements) {
            K key = keyFunction.apply(element);
            V value = valueFunction.apply(element);
            map.put(key, value);
        }
        return map;
    }
}
