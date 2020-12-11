package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.loopsandarrays.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNum = inputScanner.nextInt();

        System.out.println("Enter second number");
        int secondNum = inputScanner.nextInt();

        if (firstNum > 30 && secondNum > 30) {
            System.out.println("Both values are bigger than 30");
        } else if (firstNum < 30 && secondNum < 30) {
            System.out.println("Both values are lower than 30");
        } else if (firstNum == 30 || secondNum == 30) {
            System.out.println("One or both values are equal to 30");
        }
    }
}
