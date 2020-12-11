package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.basics.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter first value:");
        int firstNum = inputScanner.nextInt();

        System.out.println("Enter second value:");
        int secondNum = inputScanner.nextInt();

        double division = (double) firstNum / secondNum;

        System.out.printf("Rounded value %.3f", division);
    }
}
