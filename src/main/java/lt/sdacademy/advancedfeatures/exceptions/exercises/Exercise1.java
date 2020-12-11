package lt.sdacademy.advancedfeatures.exceptions.exercises;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        String text = scanner.nextLine();

        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            try {
                double floatingPointNUmber = Double.parseDouble(text);
                System.out.println(floatingPointNUmber);
            } catch (NumberFormatException ex) {
                System.out.println("Bad input!");
            }
        }
    }
}
