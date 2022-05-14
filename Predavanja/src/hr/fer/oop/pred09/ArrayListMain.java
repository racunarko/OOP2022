package hr.fer.oop.pred09;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(10); // initial capacity
        System.out.println("Size: " + array.size()); // 0
        for (int i = 0; i < 1000; i++) {
            array.add(2 * i);
        }
        System.out.println("Size: " + array.size()); // 1000
        System.out.println("Element at position 634: " + array.get(634)); // 1268

        array.add(1); // dodaje clan na kraj
        System.out.println(array.size() + " " + array.get(array.size() - 1));

        array.add(array.size() - 2,3); // dodaje clan na index i ostale pomice
        System.out.println(array.size() + " " + array.get(array.size() - 3));
        System.out.println(array.size() + " " + array.get(array.size() - 2));
        System.out.println(array.size() + " " + array.get(array.size() - 1));


        array.set(array.size() - 1, 2); // postavlja odredeni clan na neku vrijednost
        System.out.println(array.size() + " " + array.get(array.size() - 1));



    }
}
