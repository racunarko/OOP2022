package hr.fer.oop.labosi.lab02.zadButton;

public class Main {

        public static void main(String[] args) {
            Button lampButton = new Button(new LampCapability(new Lamp()));
            lampButton.click();
            lampButton.click();

            Button heatingButton = new Button(new HeatingCapability(new Heater()));
            heatingButton.click();
            heatingButton.click();
        }

}
