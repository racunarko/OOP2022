package hr.fer.oop.samostalneVjezbe.vjezba05.zad04;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.valueOf(3.1255));

        List<List<Integer>> ulaz1= Arrays.asList(Arrays.asList(1,2),Arrays.asList(0,3),Arrays.asList(2,6)); // 3.26

        boolean t11 = Solution.allDigitsMatch(3.266).test(ulaz1); // true
        System.out.println(t11);

        boolean t12 = Solution.allDigitsDefined().test(ulaz1); // true
        System.out.println(t12);

        List<List<Integer>> ulaz2=
                Arrays.asList(Arrays.asList(1,2),Arrays.asList(0,3),Arrays.asList(4,6)); // 3.2**6
        boolean t21 = Solution.allDigitsMatch(3.266).test(ulaz2); // true
        System.out.println(t21);
        boolean t22 = Solution.allDigitsDefined().test(ulaz2); // false
        System.out.println(t22);

    }
}
