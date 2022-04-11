package hr.fer.oop.homework_05.people;

import java.util.Arrays;

public class Student extends Person{
    private short academicYear;
    private int grades[];

    public Student(int id, String name, short academicYear, int[] grades) {
        super(id, name);
        this.academicYear = academicYear;
        this.grades = grades;
    }

    public short getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(short academicYear) {
        this.academicYear = academicYear;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return super.toString() + ", academicYear=" + academicYear + ", grades=" + Arrays.toString(grades);
    }

    @Override
    public double getGrade() {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        int n = 0;
        for(int g : grades) {
            sum += g;
            n++;
        }
        return (double) sum / n;
    }
}
