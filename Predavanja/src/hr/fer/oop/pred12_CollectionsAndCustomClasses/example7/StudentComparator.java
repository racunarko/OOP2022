package hr.fer.oop.pred12_CollectionsAndCustomClasses.example7;

import hr.fer.oop.pred12_CollectionsAndCustomClasses.example4.Student4;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student4> {
    @Override
    public int compare(Student4 s1, Student4 s2) {
        int r = s1.getLastName().compareTo(s2.getLastName());
        if(r != 0) {
            return r;
        }
        r = s1.getFirstName().compareTo(s2.getFirstName());
        if(r != 0) {
            return r;
        }
        return s1.getStudentID().compareTo(s2.getStudentID());
    }
}
