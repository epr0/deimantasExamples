package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.basics.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter value:");
        double number = inputScanner.nextDouble();

        System.out.printf("Rounded value %.2f", number);
    }
}