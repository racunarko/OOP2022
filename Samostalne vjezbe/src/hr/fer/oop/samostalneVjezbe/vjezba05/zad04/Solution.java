package hr.fer.oop.samostalneVjezbe.vjezba05.zad04;

import java.util.*;
import java.util.function.Predicate;

class Solution{

    public static Predicate<List<List<Integer>>> allDigitsMatch(double exemplar){
        String number = String.valueOf(exemplar);
        char[] charDigits = number.toCharArray();
        List<Integer> digits = new ArrayList<>();
        for (char c : charDigits) {
            if(c != '.') {
                digits.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        return lists -> {
            for (List<Integer> list : lists) {
                if(!digits.contains(list.get(1))) {
                    return false;
                }
            }
            return true;
        };
    }


    public static Predicate<List<List<Integer>>> allDigitsDefined(){
        return lists -> {
            Set<Integer> indexes = new TreeSet<>();
            for (List<Integer> list : lists) {
                indexes.add(list.get(0));
            }
            for (int i = 0; i < indexes.size(); i++) {
                if(!indexes.contains(i)) {
                    return false;
                }
            }
            return true;
        };
    }


    // this is from allDigitsMatch and it does... something...
    //        String number = String.valueOf(exemplar);
    //        char[] charDigits = number.toCharArray();
    //        List<Integer> digits = new ArrayList<>();
    //        for (char c : charDigits) {
    //            if(c != '.') {
    //                digits.add(Integer.parseInt(String.valueOf(c)));
    //            }
    //        }
    //        List<List<Integer>> distributed = new ArrayList<>();
    //        for (int i = 0; i < digits.size(); i++) {
    //            List<Integer> onePosition = List.of(i, digits.get(i));
    //            distributed.add(onePosition);
    //        }
    //        return lists -> {
    //            lists.sort(Comparator.comparing(o -> o.get(0)));
    //            for (int i = 0; i < lists.size(); i++) {
    //                if(!lists.get(i).equals(distributed.get(i))) {
    //                    return false;
    //                }
    //            }
    //            return true;
    //        };
}