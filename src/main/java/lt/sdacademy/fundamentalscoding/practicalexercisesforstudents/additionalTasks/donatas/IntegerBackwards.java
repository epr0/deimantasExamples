package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.additionalTasks.donatas;

import java.util.Scanner;

class IntegerBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        for (; number != 0; number /= 10) {
            int dig = number % 10;
            reverse = reverse * 10 + dig;
        }
        System.out.println("Reversed Number: " + reverse);
        System.out.println(4.2 % 10);
    }
}