package hr.fer.oop.homework_11.task05;

import hr.fer.oop.homework_11.person.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Person.loadPersons();
        List<Person> ladies = new ArrayList<>();

        printPersons(persons, p -> p.getAge() < 55, p -> p.getName() + ", " + p.getAge());
        System.out.println();
        printPersons(persons, p -> p.getGender() == Gender.FEMALE, Person::toString);
        System.out.println();

        processPersons(persons, p -> p.getAge() < 55, p -> System.out.println(p.getName() + ", " + p.getAge()));
        System.out.println();
        processPersons(persons, p -> p.getGender() == Gender.FEMALE, ladies::add);
        processPersons(ladies, person -> true, person -> System.out.println(person.getName() + ", " + ladies.size()));
        System.out.println();

        processData(persons, person -> person.getAge() < 55, person -> person.getName() + ", " + person.getAge(), System.out::println);
        System.out.println();
        processData(persons, person -> person.getGender() == Gender.FEMALE, person -> person,
                person -> {
                    ladies.add(person);
                    System.out.println(person);
                });
    }

    public static void printPersons(Iterable<Person> persons, Predicate<Person> criteria, Function<Person, String> formatter) {
        for (Person person : persons) {
            if (criteria.test(person)) {
                System.out.println(formatter.apply(person));
            }
        }
    }

    public static void processPersons(Iterable<Person> persons, Predicate<Person> criteria, Consumer<Person> action) {
        for (Person person : persons) {
            if(criteria.test(person)) {
                action.accept(person);
            }
        }
    }

    public static <T, R> void processData(Iterable<T> data, Predicate<T> criteria, Function<T, R> mapper, Consumer<R> action) {
        for (T t : data) {
            if(criteria.test(t)) {
                // R result = mapper.apply(t);
                action.accept(mapper.apply(t));
            }
        }
    }
}
