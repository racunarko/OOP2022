package hr.fer.oop.homework_11.task03;

import hr.fer.oop.homework_11.person.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Person.loadPersons();
        printAll(persons);
        System.out.println();
        printNameSurnameAge(persons);
        System.out.println();
        printIfAge(persons, 55);
    }

    public static void printAll(List<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }

    public static void printNameSurnameAge(List<Person> list) {
        for (Person p : list) {
            System.out.printf("%s %s %d\n", p.getName(), p.getSurname(), p.getAge());
        }
    }

    public static void printIfAge(List<Person> list, int ageLimit) {
        for (Person p : list) {
            if (p.getAge() < ageLimit) {
                System.out.printf("%s %s %d\n", p.getName(), p.getGender(), p.getAge());
            }
        }
    }
}
