package lt.sdacademy.fundamentals.loop.combined;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Iveskite zodi: ");
            input = scanner.nextLine();
            System.out.println("Ivestas ZODIS : " + input);
        } while (!input.equals("quit"));

    }
}
