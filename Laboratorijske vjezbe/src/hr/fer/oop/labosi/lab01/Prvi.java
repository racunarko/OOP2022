package hr.fer.oop.labosi.lab01;

public class Prvi {
    public static void main(String[] args) {
        int someArray[] = new int[] {4, 67, -2, 0, -15};
        int resultArray[] = deleteElement(someArray, 1);
        for(int num: resultArray)
            System.out.println(num);
    }
    public static int[] deleteElement (int[] arr, int index) {
        int result[] = new int[arr.length - 1];
        int indexNew = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index != i) {
                result[indexNew] = arr[i];
                indexNew++;
            }
        }
        return result;
    }
}
