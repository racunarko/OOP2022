package hr.fer.oop.pred15_Swing.swing2.events;

public class ThreadImplements implements Runnable { @Override
public void run() {
    for (int i = 0; i < 5; i++) {
        System.out.println("broj " + i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    System.out.println("Gotovo brojanje"); }
    public static void main(String[] args) {
        Runnable r1, r2;
        r1 = new ThreadImplements();
        r2 = new ThreadImplements();
        new Thread(r1).start();
        new Thread(r2).start();
    } }
