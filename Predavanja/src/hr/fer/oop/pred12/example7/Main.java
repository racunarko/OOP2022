package hr.fer.oop.pred12.example7;

import hr.fer.oop.pred12.Common;
import hr.fer.oop.pred12.example4.Student4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        StudentComparator comparator= new StudentComparator();

//        Comparator<Student4> reverse = new ReverseComparator<>(comparator);
//        Comparator<Student4> reverse = comparator.reversed();
        Comparator<Student4> reverse = Collections.reverseOrder(comparator);

        Set<Student4> students = new TreeSet<>(reverse);
        Common.fillStudentsCollection(students, Student4::new);
        System.out.println("I have following students:");
        Common.printCollection(students);
    }

}
