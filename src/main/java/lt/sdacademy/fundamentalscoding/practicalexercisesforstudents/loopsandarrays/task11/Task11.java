package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.loopsandarrays.task11;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        int number = scanner.nextInt();
        printNumber(number);

    }

    public static void printNumber(int number) {
        int previous = number;
        int multiplier = 10;
        for (int i = 0; i < number; i++) {
            int current = number * multiplier + previous;
            System.out.println(current);
            previous = current;
            multiplier *= 10;
        }
    }
}
