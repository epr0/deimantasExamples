package lt.sdacademy.fundamentals.input_output.basic_input;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Koks jūsų vardas?");
        String name = scanner.nextLine();
        System.out.println("Sveiki, " + name);

    }

}
