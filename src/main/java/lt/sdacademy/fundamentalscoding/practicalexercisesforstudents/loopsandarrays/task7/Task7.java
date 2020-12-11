package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.loopsandarrays.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner intsScanner = new Scanner(System.in);
        int firstNum = 1, secondNum = 1;

        while (true) {
            System.out.println("Enter value to be divided");
            firstNum = intsScanner.nextInt();

            System.out.println("Enter division value");
            secondNum = intsScanner.nextInt();

            if (firstNum == 0 || secondNum == 0) {
                break;
            }

            double divisionResult = (double) firstNum / secondNum;

            System.out.printf("Result: %.4f", divisionResult);
            System.out.println();
        }
    }
}
