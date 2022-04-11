package hr.fer.oop.homework_05.people;

public class Main {
    public static void main(String[] args) {
//        Person marko = new Person(123, "Marko Marsic");
        Person ivan = new Student(234, "Ivan Pujkic", (short) 2022,  new int[]{4, 2, 3, 5, 4});
        Person igor =  new Teacher(345, "Igor Mekterovic", "UPRO", 5);

//        System.out.println(marko);
        System.out.println(ivan);
        System.out.println(igor);

        System.out.println();
        System.out.println();
        Person s1 = new Student(111, "Pero Perić", (short)3, new int[] {5,3,4});
        Student s2 = new Student(115, "Ana Anić", (short)1, new int[] {5,5,4});
        Teacher t = new Teacher(615, "Mirko Mandić", "OOP", 4.83);
        Person[] people = new Person[] {s1, s2, t};
        System.out.println("Outstanding students and teachers:"); for (Person p : people)
            if (p.isOutstanding()) System.out.println(p);
    }
}
