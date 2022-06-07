package hr.fer.oop.pred13_StreamAPI.example5;

import hr.fer.oop.pred13_StreamAPI.Student;
import hr.fer.oop.pred13_StreamAPI.StudentData;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Example5b {


    public static void main(String[] args) {
        List<Student> students = StudentData.load();

        Comparator<Object> comp = Collator.getInstance(Locale.CHINA);

        String lastNames = students.stream()
                .filter(s -> s.getPoints() > 30)
                .map(Student::getLastName)
                .sorted() // ili sorted(comp)
                .collect(Collectors.joining(", "));

        System.out.println(lastNames);
    }
}
