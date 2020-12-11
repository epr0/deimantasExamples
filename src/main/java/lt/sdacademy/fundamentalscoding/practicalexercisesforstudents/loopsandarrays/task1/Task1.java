package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.loopsandarrays.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = inputScanner.nextInt();

        if (number > 30) {
            System.out.println("Number is greater than 30");
        } else if (number == 30) {
            System.out.println("Number is equal to 30");
        } else {
            System.out.println("Number is lower than 30");
        }
    }
}
