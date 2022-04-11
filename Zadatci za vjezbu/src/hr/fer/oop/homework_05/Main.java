package hr.fer.oop.homework_05;

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer("Destroyer", "CoolerMaster", "Windows");
        Computer laptop = new Laptop("MacBook Pro", "Apple", "MacOS", 15000, 1.9);
        Computer desktop = new Desktop("Mac", "Apple", "MacOS", 25.7);
        System.out.println(pc);
        System.out.println(laptop);
        System.out.println(desktop);
    }
}
