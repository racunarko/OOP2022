package hr.fer.oop.pred12.example4;

import hr.fer.oop.pred12.Common;
import hr.fer.oop.pred12.example3.Student3;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Student4> students = new HashSet<>();
        Common.fillStudentsCollection(students, Student4::new);
        System.out.println("I have following students:");
        Common.printCollection(students);

        Student4 s = new Student4("Poe", "Edgar Allan", "2345678901");
        System.out.println("Poe present: " + students.contains(s));
    }
}
