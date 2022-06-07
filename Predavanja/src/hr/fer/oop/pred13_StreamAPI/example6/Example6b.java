package hr.fer.oop.pred13_StreamAPI.example6;

import hr.fer.oop.pred13_StreamAPI.Student;
import hr.fer.oop.pred13_StreamAPI.StudentData;

import java.util.List;

public class Example6b {
    public static void main(String[] args) {
        List<Student> students = StudentData.load();
        int threshold = 20;

        students
                .stream()
                .filter(student -> student.getPoints() > threshold)
                .mapToInt(Student::getPoints)
                .average()
                .ifPresentOrElse(avg -> System.out.printf("Average points for students above threshold %.2f\n", avg),
                        () -> System.out.println("Stream contains no data"));
    }
}
