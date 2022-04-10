package hr.fer.oop.samostalneVjezbe.vjezba01;

public class Swapper {
    public static void main(String[] args) {

    }
    static void swap(int[] arr) {
        int[] index = new int[3];
        index[0] = (int) (Math.random() * arr.length);
        int i = 1;
        while (i < 3) {
            int random = (int) (Math.random() * arr.length);
            if(index[i - 1] != random) {
                index[i] = random;
                i++;
            }
        }
        java.util.Arrays.sort(index);
        int pom = arr[index[1]];
        arr[index[1]] = arr[index[2]];
        arr[index[2]] = arr[index[0]];
        arr[index[0]] = pom;
    }
}
