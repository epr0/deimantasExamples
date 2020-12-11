package lt.sdacademy.algorithmsanddatastructures.algorithms.binarysearch;

public class BinarySearchRecursive {

    private static final int VALUE_TO_FIND = 9;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int left = 0;
        int right = arr.length - 1;

        int index = binarySearch(arr, left, right);
        if (index == -1) {
            System.out.println(String.format("The value %d was not found.", VALUE_TO_FIND));
        } else {
            System.out.println(String.format("Found value %d at position %d.", VALUE_TO_FIND, index));
        }
    }

    public static int binarySearch(int[] arr, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (VALUE_TO_FIND == arr[mid]) {
                return mid;
            } else {
                if (VALUE_TO_FIND < arr[mid]) {
                    // Search in the left interval.
                    return binarySearch(arr, left, mid - 1);
                } else {
                    // Search in the right interval.
                    return binarySearch(arr, mid + 1, right);
                }
            }
        }
        // Default value returned when the element was not found in the array.
        return -1;
    }
}