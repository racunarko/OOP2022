package hr.fer.oop.auditorne.aud08.zad02;

public class Main {
    public static void main(String[] args) {
        JavelinScores js = new JavelinScores();
        js.add("Sara", 68.43);
        js.add("Sara", 68.34);
        js.add("Steffi", 68.34);
        js.add("Sara", 70.3);

        js.printScores();

        System.out.println();

        js.printBest();
    }

}
