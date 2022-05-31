package hr.fer.oop.pred12.example6;

import hr.fer.oop.pred12.Common;
import hr.fer.oop.pred12.example4.Student4;
import hr.fer.oop.pred12.example5.Student5;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<Student4> students = new TreeSet<>(new StudentComparator());
        Common.fillStudentsCollection(students, Student4::new);
        System.out.println("I have following students:");
        Common.printCollection(students);

        Student4 s = new Student4("Poe", "Edgar Allan", "2345678901");
        System.out.println("Poe present: " + students.contains(s));
    }
}
