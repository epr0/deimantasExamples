package lt.sdacademy.fundamentals.loop.while_loop;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("iveskite zodi: ");
        String input = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        System.out.println("Ivestas zodis atbulai: " + stringBuilder.reverse());
    }
}
