package hr.fer.oop.pred12_CollectionsAndCustomClasses.example2;

import hr.fer.oop.pred12_CollectionsAndCustomClasses.Common;
import hr.fer.oop.pred12_CollectionsAndCustomClasses.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Common.fillStudentsCollection(students, Student2::new);
        System.out.println("I have following students:");
        Common.printCollection(students);

        Student s = new Student2("Poe", "Edgar Allan", "2345678901");
        System.out.println("Poe present: " + students.contains(s));
    }
}
