package hr.fer.oop.homework_11.task02;

public class Main {

    public static void main(String[] args) {
        Airplane.Cargo mail = new Airplane.Cargo("mail", 50);

        Airplane airplane = new Airplane("Croatia Airlines");
        Airplane.Captain captain = airplane.new Captain("Sully");
        airplane.addCargo(mail);

        airplane.addCargo(new Airplane.Cargo("luggage", 500));

        captain.sayWelcomeAndPilot("Rijeka", "Venice");
    }
}
