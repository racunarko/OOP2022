package hr.fer.oop.pred13.example2;

import hr.fer.oop.pred13.Student;
import hr.fer.oop.pred13.StudentData;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args) {
        List<Student> students = StudentData.load();

        students.stream().filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getPoints() >= 40;
            }
        }).forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });

        System.out.println();

        students.stream().filter(student -> student.getPoints() >= 40).forEach(System.out::println) ;
    }
}
