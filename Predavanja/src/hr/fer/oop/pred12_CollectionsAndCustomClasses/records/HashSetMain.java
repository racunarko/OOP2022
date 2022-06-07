package hr.fer.oop.pred12_CollectionsAndCustomClasses.records;

import hr.fer.oop.pred12_CollectionsAndCustomClasses.Common;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student.fillStudentsCollection(students);
        System.out.println("I have following students:");
        Common.printCollection(students);

        Student s = new Student("Poe", "Edgar Allan", "2345678901");
        System.out.println("Poe present: " + students.contains(s));
    }
}
