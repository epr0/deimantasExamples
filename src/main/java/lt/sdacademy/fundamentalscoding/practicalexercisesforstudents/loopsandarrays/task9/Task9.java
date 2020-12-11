package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.loopsandarrays.task9;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 0; i< 5; i++) {
            int[] ints = generateIntArray();
            int maxValue = findMax(ints);

            System.out.println("Max value: " + maxValue);
        }
    }

    private static int[] generateIntArray() {
        Random random = new Random();

        int[] intArray = random.ints(5).toArray();
        for (int number : intArray) {
            System.out.print(number + " ");
        }
        return intArray;
    }

    private static int findMax(int[] intArray) {
        int max = intArray[0];

        for (int number : intArray) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
