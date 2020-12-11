package lt.sdacademy.algorithmsanddatastructures.algorithms.binarysearch;

// Uzduotis -> parasyti rekursyvia dvejataines paieskos programa
public class BinarySearch {

    private static final int VALUE_TO_FIND = 4;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 44};

        int left = 0;
        int right = arr.length - 1;
        int mid;

        boolean found = false;

        while (left <= right) {
            mid = (left + right) / 2;
            if (VALUE_TO_FIND == arr[mid]) {
                System.out.printf("Found value %d at position %d.", VALUE_TO_FIND, mid + 1);
                found = true;
                break;
            } else {
                if (VALUE_TO_FIND < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (!found) {
            System.out.printf("The value %d was not found.", VALUE_TO_FIND);
        }
    }
}