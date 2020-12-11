package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.basics.task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite eilute");
        String inputString = scanner.nextLine();
        System.out.println("iveskite antra eilute");
        String secondInputString = scanner.nextLine();

        System.out.println(inputString.contains(secondInputString));

        System.out.println("Iveskite eilute");
        String inputStringThree = scanner.nextLine();
        System.out.println("iveskite skaiciu");
        int number = scanner.nextInt();
        System.out.println(inputStringThree.contains(String.valueOf(number)));
    }
}
