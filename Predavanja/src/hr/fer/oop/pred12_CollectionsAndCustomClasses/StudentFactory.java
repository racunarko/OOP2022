package hr.fer.oop.pred12_CollectionsAndCustomClasses;

@FunctionalInterface
public interface StudentFactory<S extends Student> {
    S create(String lastName, String firstName, String studentID);
}
