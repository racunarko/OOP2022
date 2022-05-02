package hr.fer.oop.auditorne.aud07.sorted;

import hr.fer.oop.auditorne.aud07.list.MyList;

public class Main {

    public static void main(String[] args) {
        MySortedList<String> list = new MySortedList<>();

        list.add("F");
        list.add("B");
        list.add("C");
        list.add("H");
        list.add("A");
        list.add("E");
        list.add("G");
        list.print();

        list.removeAt(1);
        list.print();

        list.add("D");
        list.print();

        //list.add(1); //compile error

    }

}
