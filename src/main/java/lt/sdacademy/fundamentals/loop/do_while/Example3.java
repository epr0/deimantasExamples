package lt.sdacademy.fundamentals.loop.do_while;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("iveskite zodi: ");
            String input = scanner.nextLine();
            System.out.println("ivedete: " + input);
        } while (false) ;

    }
}
