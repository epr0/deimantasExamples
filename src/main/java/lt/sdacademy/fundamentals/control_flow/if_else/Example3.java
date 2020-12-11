package lt.sdacademy.fundamentals.control_flow.if_else;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        //int age = 35;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Iveskite savo amziu:");
        int ivestasAmzius = inputScanner.nextInt();

        if (ivestasAmzius < 18) {
            System.out.println("Tu paauglys!");
        } else if (ivestasAmzius > 100) {
            System.out.println("Tu labai senas!");
        } else {
            System.out.println("Tu suaugęs!");
        }



    }

}
