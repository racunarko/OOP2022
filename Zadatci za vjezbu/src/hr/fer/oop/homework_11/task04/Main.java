package hr.fer.oop.homework_11.task04;

import hr.fer.oop.homework_11.person.Person;
import hr.fer.oop.homework_11.person.PersonDataFormatter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Person.loadPersons();

        PersonDataFormatterImplementation allDataFormatter = new PersonDataFormatterImplementation();
        PersonDataFormatter.printAll(persons, allDataFormatter);
        System.out.println();

        PersonDataFormatter.printAll(persons, new PersonDataFormatterImplementation() {
            @Override
            public String format(Person person) {
                return String.format("%s %s %d", person.getName(), person.getSurname().toUpperCase(), person.getAge());
            }
        });
        System.out.println();

        PersonDataFormatter nameAndBirthDayFormatter = new PersonDataFormatter() {
            @Override
            public String format(Person person) {
                return String.format("%s was born %s", person.getName(), person.getBirthday());
            }
        };

        PersonDataFormatter.printAll(persons, nameAndBirthDayFormatter);
        System.out.println();

        nameAndBirthDayFormatter.print(persons.get(0));
        System.out.println();

        PersonDataFormatter lambdaFormatter = (Person p) -> {
            return String.format("%s was born %s", p.getName(), p.getBirthday());
        };

        lambdaFormatter = person -> String.format("%s was born %s", person.getName(), person.getBirthday());

        PersonDataFormatter.printAll(persons, lambdaFormatter);
        System.out.println();

        PersonDataFormatter.printAll(persons, Person::toString);
        System.out.println();

        PersonDataFormatter.printAll(persons, Main::aMethod);
    }

    public static String aMethod(Person p) {
        return  "My name is " + p.getName() + " " + p.getSurname() + " and I am " + p.getAge() + " years old.";
    }

}