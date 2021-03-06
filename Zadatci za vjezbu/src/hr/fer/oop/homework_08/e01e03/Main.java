package hr.fer.oop.homework_08.e01e03;

public class Main {
    public static void main(String[] args) {
        KeyValueBasic obj = new KeyValueBasic(5, "5");
        System.out.println(obj.toString());

        KeyValueParameterized<Integer, String> obj1 = new KeyValueParameterized<>(5, "5");
        System.out.println(obj1.toString());

        KeyValueMapEntry<Integer, String> kv = new KeyValueMapEntry<>(1, "Dinamo");
        System.out.println(kv);

        KeyValueMapEntry<String, String> kv2 = new KeyValueMapEntry<>("number one", "Dinamo");
        System.out.println(kv2);

        KeyValueMapEntry<String, Double> kv3 = new KeyValueMapEntry<>("Dinamo", 0.01d);
        System.out.println("old value:" + kv3.setValue(100.00));
        System.out.println(kv3);
    }
}
