package hr.fer.oop.pred12.example2;

import hr.fer.oop.pred12.Student;

public class Student2 extends Student {

    public Student2(String lastName, String firstName, String studentID) {
        super(lastName, firstName, studentID);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student2 other)) return false;
        return this.studentID.equals(other.studentID);
    }
}
