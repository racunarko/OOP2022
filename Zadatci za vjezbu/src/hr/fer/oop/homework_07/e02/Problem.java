package hr.fer.oop.homework_07.e02;

public class Problem {

    public static void main(String[] args) {
        String[] input1 = { "a", "b", "c", "d" };
        exceptionalMethod(input1);

        String[] input2 = { "a", "b", "e", "" };
        exceptionalMethod(input2);

        String[] input3 = { "a", "b", "d", null };
        exceptionalMethod(input3);
    }

    private static void exceptionalMethod(String[] input) {
        String result = "";
        for (String string : input) {
            try {
                String upper = string.toUpperCase();
                try {
                    result += upper.toCharArray()[0];
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Caught: " + e.getMessage());
                }
            } catch (NullPointerException e) {
                System.out.println("Caught: " + e.getMessage());
            }

//            try{
//                String upper = string.toUpperCase();
//                result += upper.toCharArray()[0];
//            }
//            catch (NullPointerException | IndexOutOfBoundsException exc) {
//                System.out.println("Caught: " + exc.getMessage());
//            }


//            catch (IndexOutOfBoundsException exc) {
//                System.out.println("Caught: " + exc.getMessage());
//            }
        }
        System.out.println(result);
    }

}