package hr.fer.oop.homework_11.task04;

import hr.fer.oop.homework_11.person.Person;
import hr.fer.oop.homework_11.person.PersonDataFormatter;

public class PersonDataFormatterImplementation implements PersonDataFormatter {

    @Override
    public String format(Person person) {
        return String.format("%s %s %s %s %d", person.getName(), person.getSurname(), person.getBirthday(),
                                                person.getGender(), person.getAge());
    }
}
