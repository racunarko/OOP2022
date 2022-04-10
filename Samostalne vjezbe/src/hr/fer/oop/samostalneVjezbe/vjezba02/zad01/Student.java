package hr.fer.oop.samostalneVjezbe.vjezba02.zad01;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private String name, surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

}
