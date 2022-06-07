package hr.fer.oop.pred13_StreamAPI.example1;

import hr.fer.oop.pred13_StreamAPI.Student;
import hr.fer.oop.pred13_StreamAPI.StudentData;

import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        List<Student> students = StudentData.load();

        //using anonymous class
        students.stream().forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });

        System.out.println();

        // using lambda
        students.stream().forEach(student -> System.out.println(student));

        System.out.println();

        // using method reference
        students.stream().forEach(System.out::println);
    }
}
