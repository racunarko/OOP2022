package hr.fer.oop.homework_01_02;

public class Lotto7Of39 {
    public static void main(String[] args) {
        boolean numbers[] = new boolean[39];
        for(int i = 0; i < 7; ) {
            int num = (int) (Math.random() * 39);
            if(!numbers[num]) {
                numbers[num] = true;
                ++i;
            }
        }
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i]) {
                System.out.printf("The number is %d %n", i + 1);
            }
        }
    }
}
