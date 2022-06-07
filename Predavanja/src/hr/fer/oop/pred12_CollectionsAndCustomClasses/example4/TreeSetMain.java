package hr.fer.oop.pred12_CollectionsAndCustomClasses.example4;

import hr.fer.oop.pred12_CollectionsAndCustomClasses.Common;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<Student4> students = new TreeSet<>();
        Common.fillStudentsCollection(students, Student4::new);
        System.out.println("I have following students:");
        Common.printCollection(students);

        Student4 s = new Student4("Poe", "Edgar Allan", "2345678901");
        System.out.println("Poe present: " + students.contains(s));
    }
}
