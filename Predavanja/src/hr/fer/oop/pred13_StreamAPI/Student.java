package hr.fer.oop.pred13_StreamAPI;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String lastName;
    private String firstName;
    private String studentID;
    private int points;

    public Student(String lastName, String firstName, String studentID, int points) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentID = studentID;
        this.points = points;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s %s points=%d", studentID, firstName, lastName, points);
    }


    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    //private static Comparator<Object> comparator = Collator.getInstance(Locale.CHINA);
    private static Comparator<Object> comparator = Collator.getInstance(Locale.forLanguageTag("hr"));

    public static final Comparator<Student> BY_LAST_NAME = (o1, o2) -> comparator.compare(o1.lastName, o2.lastName);
    public static final Comparator<Student> BY_FIRST_NAME = (o1, o2) -> comparator.compare(o1.firstName, o2.lastName);
    public static final Comparator<Student> BY_STUDENT_ID = (o1, o2) -> comparator.compare(o1.studentID, o2.getStudentID());
//    public static final Comparator<Student> BY_STUDENT_ID = Comparator.comparing(Student::getStudentID);
    public static final Comparator<Student> BY_POINTS = (o1, o2) -> comparator.compare(o1.getPoints(), o2.getPoints());
}
