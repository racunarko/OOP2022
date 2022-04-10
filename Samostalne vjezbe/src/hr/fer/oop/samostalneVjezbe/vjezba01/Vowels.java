package hr.fer.oop.samostalneVjezbe.vjezba01;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(brojSamoglasnika("Onomatopeja"));
    }
    public static int brojSamoglasnika(String str) {
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
