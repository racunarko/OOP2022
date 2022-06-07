package hr.fer.oop.pred12_CollectionsAndCustomClasses.example8;

import hr.fer.oop.pred12_CollectionsAndCustomClasses.example5.Student5;

import java.util.Comparator;

public class Student8 extends Student5 {
    public Student8(String lastName, String firstName, String studentID) {
        super(lastName, firstName, studentID);
    }
    public static final Comparator<Student8> BY_LAST_NAME = (s1, s2) -> s1.lastName.compareTo(s2.lastName);

    public static final Comparator<Student8> BY_FIRST_NAME = Comparator.comparing(Student8::getFirstName);

    public static final Comparator<Student8> BY_STUDENT_ID = Comparator.comparing(s -> s.studentID);

}
