package lt.sdacademy.fundamentals.control_flow.switch_case;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //char direction = scanner.next().charAt(0);
        String input = scanner.nextLine();

        switch (input) {
            case "sw":
                System.out.println("Keliaujame pietvakariu kryptimi!");
                break;
            case "s":
                System.out.println("Keliaujame pietų kryptimi!");
                break;
            case "e":
                System.out.println("Keliaujame rytų kryptimi!");
                break;
            case "w":
                System.out.println("Keliaujame vakarų kryptimi!");
                break;
            default:
                System.out.println("Keliaujame nežinoma kryptimi!");
        }

    }

}
