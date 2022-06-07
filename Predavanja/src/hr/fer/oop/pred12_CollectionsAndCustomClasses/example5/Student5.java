package hr.fer.oop.pred12_CollectionsAndCustomClasses.example5;

import hr.fer.oop.pred12_CollectionsAndCustomClasses.example4.Student4;

public class Student5 extends Student4 implements Comparable<Student5> {
    public Student5(String lastName, String firstName, String studentID) {
        super(lastName, firstName, studentID);
    }

    @Override
    public int compareTo(Student5 other) {
        return this.studentID.compareTo(other.studentID);
    }
}
