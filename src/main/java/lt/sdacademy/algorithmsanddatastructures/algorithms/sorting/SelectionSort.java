package lt.sdacademy.algorithmsanddatastructures.algorithms.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 4, 6, 2, 4, 7, 8, 9, 1};
        int[] sortedArr = sort(arr);

        for (int element : sortedArr) {
            System.out.println(element);
        }
    }

    private static int[] sort(int[] arr) {
        int n = arr.length;
        int minIndex;
        int aux;

        for (int i = 0; i < n; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            aux = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = aux;
        }
        return arr;
    }
}
