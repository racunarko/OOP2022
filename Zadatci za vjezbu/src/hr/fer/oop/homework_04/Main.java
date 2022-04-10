package hr.fer.oop.homework_04;

public class Main {

    public static void main(String[] args) {
        /*Dessert iceCream = new IceCream("zagi", 500.5, 300, "chocolate", "brown");
        Dessert birthdayCake = new Cake("rodendanska", 850.5, 1500, true, "birthday");
        Dessert fruitSalad = new Dessert("vocka", 350.5, 150);

        Cake birthdayCake2 = new Cake("rodendanska", 850.5, 1500, true, "birthday");
        IceCream iceCream2 = new IceCream("zagi", 500.5, 300, "chocolate", "brown");;

        System.out.println(iceCream.getDessertType() + ":       " + iceCream.toString());
        System.out.println(birthdayCake.getDessertType() + ":   " + birthdayCake.toString());
        System.out.println(fruitSalad.getDessertType() + ":         " + fruitSalad.toString());
        System.out.println();
        System.out.println(iceCream2.getDessertType() + ":       " + iceCream2.toString());
        System.out.println(birthdayCake2.getDessertType() + ":   " + birthdayCake2.toString());*/

        /*Person p1 = new Person("Ivo", "Ivic", 20);
        Person p2 = new Person("Ivo", "Ivic", 20);
        Person p3 = new Student("Ivo", "Ivic", 20, "0036312123", (short)3);
        Person p4 = new Student("Marko", "Maric", 25, "0036312123", (short)5);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p4));

        System.out.println("Je li instanca? \n");
        System.out.println(p3 instanceof Object);

        Person p5 = new Brucos("Marko", "Maric", 25, "0036312123", (short)5);
        System.out.println(p5 instanceof Object);*/

        Dessert genericDessert = new Dessert("Chocolate Mousse", 120, 300);
        Cake cake = new Cake("Raspberry chocolate cake #3", 350.5, 400, false, "birthday");

        Teacher t1 = new Teacher("Dario", "Tusek", 42, "dario.tusek@fer.hr", "OOP", 10000);
        Teacher t2 = new Teacher("Doris", "Bezmalinović", 43, "doris.bezmalinovic@fer.hr", "OOP", 10000);

        Student s1 = new Student("Janko", "Horvat", 18, "0036312123", (short) 1);
        Student s2 = new Student("Ana", "Kovač", 19, "0036387656", (short) 2);
        Student s3 = new Student("Ivana", "Stanic", 19, "0036392357", (short) 1);

        UniMasterChef competition = new UniMasterChef(2);

        CompetitionEntry e1 = new CompetitionEntry(t1, genericDessert);
        competition.addEntry(e1);
        System.out.println("Entry 1 rating: " + e1.getRating());

        e1.addRating(s1, 4);
        e1.addRating(s2, 5);
        System.out.println("Entry 1 rating: " + e1.getRating());

        CompetitionEntry e2 = new CompetitionEntry(t2, cake);
        e2.addRating(s1, 4);
        e2.addRating(s3, 5);
        e2.addRating(s2, 5);
        competition.addEntry(e2);
        System.out.println("Entry 2 rating: " + e2.getRating());

        System.out.println("Best dessert is: " + competition.getBestDessert().getName());

        Person[] e2persons = UniMasterChef.getInvolvedPeople(e2);
        for (Person p : e2persons) {
            System.out.println(p);
        }
    }
}
