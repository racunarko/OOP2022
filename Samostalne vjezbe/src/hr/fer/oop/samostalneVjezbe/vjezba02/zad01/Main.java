package hr.fer.oop.samostalneVjezbe.vjezba02.zad01;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student marko = new Student("Marko", "Marsic", 25);
        Student petar = new Student("Pero", "Peric", 18);
        Student ivan = new Student("Ivan", "Gas", 17);
        Student[] polje = new Student[] {marko, ivan, petar};
        System.out.println("Prije sortiranja");
        for(Student s : polje) {
            System.out.println(s.getName() + " " + s.getSurname() + " " + s.getAge());
        }
        sortStudentsOnAge(polje);
        System.out.println("Poslije soritranja");
        for(Student s : polje) {
            System.out.println(s.getName() + " " + s.getSurname() + " " + s.getAge());
        }
    }

    static void sortStudentsOnAge(Student[] students) {
        /*
        Student temp;
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].getAge() > students[j].getAge()) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }*/
        Arrays.sort(students, Comparator.comparing(Student::getAge));

    }

}
