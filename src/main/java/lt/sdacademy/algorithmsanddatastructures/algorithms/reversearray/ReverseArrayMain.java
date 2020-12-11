package lt.sdacademy.algorithmsanddatastructures.algorithms.reversearray;

public class ReverseArrayMain {

    private static final int[] INTS = {1, 5, 6, 77, 12, 5, 2, 123};

    public static void main(String[] args) {
        int[] reversedArray = reverseArray();

        printArray(INTS, "Original array");
        printArray(reversedArray, "\nReversed array");

    }

    private static int[] reverseArray() {
        int[] tempArr = new int[INTS.length];

        for (int i = 0; i < INTS.length; i++) {
            tempArr[i] = INTS[INTS.length - i - 1];
        }
        return tempArr;
    }

    private static void printArray(int[] array, String message) {
        System.out.print(message + ": ");
        for (int number : array)
            System.out.print(number + " ");
    }

}
