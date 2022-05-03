package hr.fer.oop.samostalneVjezbe.vjezba03.zad04;

public class Main {
    public static void main(String[] args) {
        Items<String> lubenica = new Items<String>("lubenica", 10, Type.ITEM);
        lubenica.setQuantity(3);   // --> IllegalArgumentException
        Items<Integer> jabukaCrvena = new Items<Integer>(123, 80, Type.KG);
        jabukaCrvena.setQuantity(500.5);
        System.out.println(jabukaCrvena.getPrice());
    }
}
