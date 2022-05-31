package hr.fer.oop.pred12.example8;

import hr.fer.oop.pred12.Common;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Student8> comparator = new CompositeComparator<>(
                Student8.BY_FIRST_NAME.reversed(),
                Student8.BY_LAST_NAME,
                Comparator.naturalOrder()
                // same as Comparator.<Student8>naturalOrder()
        );
        // or using default method in Comparator...
        Comparator<Student8> comparator2 = Student8.BY_FIRST_NAME.reversed()
                                                                 .thenComparing(Student8.BY_LAST_NAME)
                                                                 .thenComparing(Comparator.naturalOrder());

        Set<Student8> students = new TreeSet<>(comparator);

        Common.fillStudentsCollection(students, Student8::new);
        System.out.println("I have following students:");
        Common.printCollection(students);
    }
}
