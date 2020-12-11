package lt.sdacademy.algorithmsanddatastructures.algorithms.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 4, 6, 2, 4, 7, 8, 9, 1};
        int[] sortedArr = sort(arr);

        for (int element : sortedArr) {
            System.out.println(element);
        }
    }

    private static int[] sort(int[] arr) {
        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                int element = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = element;
                }
            }
        }
        return arr;
    }


}
