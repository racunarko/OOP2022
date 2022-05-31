package hr.fer.oop.pred12.example2;

import hr.fer.oop.pred12.Common;
import hr.fer.oop.pred12.Student;


import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Common.fillStudentsCollection(students, Student2::new);
        System.out.println("I have following students:");
        Common.printCollection(students);

        Student s = new Student2("Poe", "Edgar Allan", "2345678901");
        System.out.println("Poe present: " + students.contains(s));
    }
}
