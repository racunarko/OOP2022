package hr.fer.oop.pred13_StreamAPI.example4;

import hr.fer.oop.pred13_StreamAPI.Student;
import hr.fer.oop.pred13_StreamAPI.StudentData;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Student> students = StudentData.load();

        students.stream()
                .filter(s -> s.getPoints() >= 40)
                .sorted(Student.BY_LAST_NAME)
                .forEach(System.out::println);

        System.out.println();

        students.stream()
                .forEach(System.out::println);
    }
}
