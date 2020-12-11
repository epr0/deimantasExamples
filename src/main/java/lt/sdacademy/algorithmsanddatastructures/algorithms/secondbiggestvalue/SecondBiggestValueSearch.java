package lt.sdacademy.algorithmsanddatastructures.algorithms.secondbiggestvalue;

public class SecondBiggestValueSearch {

    private static final int[] INTS = {1, 90, 6, 11, 90, 4};

    public static void main(String[] args) {
        System.out.printf("Antras pagal dydį masyvo elementas: %d", secondBiggestArrayValue());
    }

    private static int secondBiggestArrayValue() {
        int max = getMax();
        int secondBiggestNumber = INTS[0];

        for (int number : INTS) {
            if (number < max && number > secondBiggestNumber) {
                secondBiggestNumber = number;
            }
        }
        return secondBiggestNumber;
    }

    private static int getMax() {
        int max = INTS[0];

        for (int number : INTS) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
