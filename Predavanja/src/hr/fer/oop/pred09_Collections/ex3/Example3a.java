package hr.fer.oop.pred09_Collections.ex3;

public class Example3a {
    public static void main(String[] args) {
        String[] names = { "Boris", "Anna", "Boris", "Wang", "Anna", "Li", "Chen", "Li" };

        writeInReverse(names);
    }

    public static void writeInReverse(String[] names) {
        for (int i = names.length - 1; i >= 0; i--) {
            if(!isPresentInRange(names[i], names, i + 1, names.length - 1)) {
                System.out.println(names[i]);
            }
        }
    }

    private static boolean isPresentInRange (String element, String[] array, int from, int to) {
        for (int i = from; i <= to ; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}
