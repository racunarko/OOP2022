package hr.fer.oop.pred12_CollectionsAndCustomClasses.example4;

import hr.fer.oop.pred12_CollectionsAndCustomClasses.Student;

public class Student4 extends Student {
    public Student4(String lastName, String firstName, String studentID) {
        super(lastName, firstName, studentID);
    }

    @Override
    public int hashCode() {
        return this.studentID.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student4 other)) return false;
        return this.studentID.equals(other.studentID);
    }
}
