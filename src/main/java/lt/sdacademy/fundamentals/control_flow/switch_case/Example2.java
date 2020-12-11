package lt.sdacademy.fundamentals.control_flow.switch_case;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char direction = 0;

        while(direction != 'x') {
            System.out.println("Iveskite simboli: ");
            direction = scanner.next().charAt(0);
            switch (direction) {
                case 'n':
                    System.out.println("Keliaujame šiaurės kryptimi!");
                    break;
                case 's':
                    System.out.println("Keliaujame pietų kryptimi!");
                    break;
                case 'e':
                    System.out.println("Keliaujame rytų kryptimi!");
                    break;
                case 'w':
                    System.out.println("Keliaujame vakarų kryptimi!");
                    break;
                default:
                    System.out.println("Keliaujame nežinoma kryptimi!");
            }

        }
    }
}
