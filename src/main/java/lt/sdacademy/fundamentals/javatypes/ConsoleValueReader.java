package lt.sdacademy.fundamentals.javatypes;

import java.util.Scanner;

public class ConsoleValueReader {

   // Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //paprasyti ivesti tris skaicius, isvesti i ekrana ju suma.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite tris skaicius: ");
        int pirmas = scanner.nextInt();
        int antras = scanner.nextInt();
        int trecias = scanner.nextInt();

        System.out.println("skaiciu suma: " + (pirmas + antras + trecias));


    }
}
