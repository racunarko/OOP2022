package hr.fer.oop.pred12.example6;

import hr.fer.oop.pred12.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStudentID().compareTo(s2.getStudentID());
    }
}
