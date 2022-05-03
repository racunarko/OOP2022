package hr.fer.oop.samostalneVjezbe.vjezba03.zad01;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

class Utils {


    public static int checkPassword(String input) {
        int noOfUppercase = 0;
        int noOfNumbers = 0;
        int ocjena = 0;

        if(input.length() < 6) {
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < input.length(); i++) {
            if(isUpperCase(input.charAt(i))) {
                noOfUppercase++;
            }
            else if(isDigit(input.charAt(i))){
                noOfNumbers++;
            }
        }

        ocjena = input.length() + noOfNumbers * 3 + noOfUppercase * 2;

        if(ocjena < 10 && input.length() < 6) {
            throw new IllegalArgumentException();
        }

        if(ocjena < 10) {
            throw new SecurityException();
        }

        return ocjena;
    }
}
