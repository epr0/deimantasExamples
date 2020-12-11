package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.loopsandarrays.task8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        boolean programOn = true;

        while (programOn) {
            System.out.println("Enter text");
            String text = textScanner.nextLine();

            String reverseText = reverseText(text);
            System.out.println("Reverse test: " + reverseText);

            System.out.println("Write \"Continue\" if you want to start from beginning and \"Quit\" if you want to quit");
            String userAnswer = textScanner.nextLine();

            programOn = onceMore(userAnswer);
        }

        System.out.println("Good Bye!");
    }

    private static String reverseText(String text) {
        String reverseText = "";
        int textLength = text.length();
        char[] textInCharArray = text.toCharArray();

        for (int i = 0; i < textLength; i++) {
            reverseText += textInCharArray[textLength - i - 1];
        }
        return reverseText;
    }

    private static boolean onceMore(String userAnswer) {
        if (userAnswer.toLowerCase().equals("continue")) {
            return true;
        } else if (userAnswer.toLowerCase().equals("quit")) {
            return false;
        } else {
            throw new InputMismatchException("User input not recognized!");
        }
    }
}
