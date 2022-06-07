package hr.fer.oop.pred09_Collections;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Size: " + list.size()); // 0
        for (int i = 0; i < 500; i++) {
            list.add(2 * i);
        }
        System.out.println("Size: " + list.size()); // 500
        System.out.println("Element at pos. 450: " + list.get(450)); // 900
    }
}
