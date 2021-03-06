package hr.fer.oop.pred13_StreamAPI.example3;

import hr.fer.oop.pred13_StreamAPI.Student;
import hr.fer.oop.pred13_StreamAPI.StudentData;

import java.util.List;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        List<Student> students = StudentData.load();
        Stream<Student> st = students.stream();

        st.forEach(t -> System.out.println(t));

        try{
            st.forEach(t -> System.out.println(t));
        }
        catch(Exception exc){
            System.out.println(exc);
        }

        students.stream().forEach(t -> System.out.println(t));

    }
}
