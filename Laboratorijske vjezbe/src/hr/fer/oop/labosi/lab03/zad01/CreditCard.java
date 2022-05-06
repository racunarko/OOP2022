package hr.fer.oop.labosi.lab03.zad01;


class CreditCard {
    public static boolean checkCreditCard(String stringPAN, String cardType) {
        boolean valid = false;
        Long pan;
//        if(stringPAN.length() != 16) {
//            throw new InvalidPANLengthException();
//        }
//        try {
//            pan = Long.parseLong(stringPAN);
//        } catch (Exception e) {
//            throw new InvalidPANCharacterException();
//        }
//
//        int chkDigit = getChecksum(pan);
//        int digit = Integer.parseInt(String.valueOf(stringPAN.charAt(15)));
//
//        if(chkDigit != digit) {
//            throw new InvalidPANChecksumException();
//        }
//
//        int firstDig = Integer.parseInt(String.valueOf(stringPAN.charAt(0)));
//
//        if (firstDig < 3 || firstDig > 6) {
//            throw new InvalidCardException();
//        }

        if (cardType.equals("Diners")) {
            valid = true;
        }
        if (cardType.equals("Visa")) {
            valid = true;
        }
        if (cardType.equals("MasterCard")) {
            valid = true;
        }
        if (cardType.equals("AmEx")) {
            valid = true;
        }

        return valid;
    }
    public static int getChecksum(Long numbPAN) {
        long temp = numbPAN;
        long sum = 0;
        long lastDig = temp % 10;
        while (temp != 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        sum = sum - lastDig;
        return (int)(sum % 10);
    }
}
