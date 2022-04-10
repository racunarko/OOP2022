package hr.fer.oop.pred02.simple;

public class Nizovi {

    public static void main(String[] args) {

        double[] polje;
        polje = new double[5];
        double[] polje2 = new double[12];

        System.out.println(polje2.length);

        for (int i = 0; i < polje.length; i++) {
            polje[i] = Math.random();
        }

        for (int i = 0; i < polje.length; i++) {
            System.out.print(polje[i] + " ");
        }



    }
}
