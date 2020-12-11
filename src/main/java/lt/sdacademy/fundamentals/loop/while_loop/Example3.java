package lt.sdacademy.fundamentals.loop.while_loop;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite teksta");
        String strInput = scanner.nextLine();
        String x = "";

        while(!x.equalsIgnoreCase("stop")){
            System.out.println("Ivedete teksta: " + strInput);
            System.out.println("Noredami baigti, iveskite - stop");
            x = scanner.nextLine();
        }
        System.out.println("PABAIGA!");


    }
}
