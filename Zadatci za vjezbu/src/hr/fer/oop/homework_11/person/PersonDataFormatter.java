package hr.fer.oop.homework_11.person;

@FunctionalInterface
public interface PersonDataFormatter {
    String format(Person person);

    default void print(Person person) {
        System.out.println(format(person));
    }

    static void printAll(Iterable<Person> persons, PersonDataFormatter formatter) {
        for(Person person : persons) {
            System.out.printf("%s\n", formatter.format(person));
        }
    }
}