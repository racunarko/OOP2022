package hr.fer.oop.pred13_StreamAPI.example5;

import hr.fer.oop.pred13_StreamAPI.Student;
import hr.fer.oop.pred13_StreamAPI.StudentData;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<Student> students = StudentData.load();

        // using anonymous classes
        List<String> lastNames = students.stream().filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getPoints() > 30;
            }
        }).map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getLastName();
            }
        }).sorted().collect(Collectors.toList());

        // using lambda expressions

        lastNames = students.stream()
                .filter(s -> s.getPoints() > 30)
                .map(Student::getLastName)
                .sorted()
                .collect(Collectors.toList());

        lastNames.stream().forEach(System.out::println);
    }
}
