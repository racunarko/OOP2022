package hr.fer.oop.samostalneVjezbe.vjezba01;

public class Common {
    public static void main(String[] args) {
        System.out.println(common_digit(2, 10));
    }
    static boolean common_digit(int twoDigitNum1, int twoDigitNum2) {
        boolean output = false;
        if (twoDigitNum1 >= 10 && twoDigitNum1 <= 99 && twoDigitNum2 >= 10 && twoDigitNum2 <= 99) {
            int tenNum1 = twoDigitNum1 % 100 / 10;
            int unitNum1 = twoDigitNum1 % 10;
            int tenNum2 = twoDigitNum2 % 100 / 10;
            int unitNum2 = twoDigitNum2 % 10;

            if (unitNum1 == unitNum2 || tenNum1 == tenNum2 || unitNum1 == tenNum2 || unitNum2 == tenNum1)
            {
                output = true;
            }
        }
        return output;
    }
}
