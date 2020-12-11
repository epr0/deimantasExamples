package lt.sdacademy.fundamentalscoding.practicalexercisestogether.averagecalculator;


import java.util.Arrays;
import java.util.List;

public class AverageCalculatorMain {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 13, 1, 32, 4, 5, 1);

        int sum = 0;

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        double average = getAverage(integers, sum);

        System.out.printf("Vidurkis: %.2f ", average);
    }

    private static double getAverage(List<Integer> integers, int sum) {
        for (Integer number : integers) {
            sum += number;
        }
        System.out.println(sum);
        return (double) sum / integers.size();
    }
}
