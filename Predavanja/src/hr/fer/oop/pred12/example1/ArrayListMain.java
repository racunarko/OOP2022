package hr.fer.oop.pred12.example1;

import hr.fer.oop.pred12.Common;
import hr.fer.oop.pred12.Student;
import hr.fer.oop.pred12.StudentFactory;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        StudentFactory<Student> factory = (lastName, firstName, studentID) -> new Student(lastName, firstName, studentID); // or Student::new

        Common.fillStudentsCollection(students, factory);
        System.out.println("I have following students:");
        Common.printCollection(students);

        Student s = new Student("Poe", "Edgar Allan", "2345678901");
        System.out.println("Poe present: " + students.contains(s));
    }

}
