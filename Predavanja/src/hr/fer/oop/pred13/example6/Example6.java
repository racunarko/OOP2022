package hr.fer.oop.pred13.example6;

import hr.fer.oop.pred13.Student;
import hr.fer.oop.pred13.StudentData;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Example6 {
    public static void main(String[] args) {
        List<Student> students = StudentData.load();
        int threshold = 20;

        double avgGrade = students.stream().filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getPoints() > threshold;
            }
        }).mapToInt(new ToIntFunction<Student>() {
            @Override
            public int applyAsInt(Student value) {
                return value.getPoints();
            }
        }).average().getAsDouble();
        System.out.format("Average points for students above threshold %.2f%n", avgGrade);

        double avg2 = students.stream()
                .filter(s -> s.getPoints() > threshold)
                .mapToInt(Student::getPoints)
                .average()
                .getAsDouble();                     //warning: throws Exception if no data => use .ifPresent or .ifPresentOrElse instead
        System.out.format("Average points for students above threshold %.2f%n", avgGrade);
    }
}
