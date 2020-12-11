package lt.sdacademy.fundamentals.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PerimeterCounter {

    /*
    Write a Java program to print the area and perimeter of a rectangle.
     */


    public static void main(String[] strings) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite krastines auksti: ");
        double height = scanner.nextDouble();
        System.out.println("Iveskite krastines ploti: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (height + width);
        double area = width * height;

        System.out.println("Perimetras yra 2 * (" + width + " + " + height + ") = " + Math.round(perimeter));
        System.out.println("Plotas yra (" + width + " * " + height + ") = " + Math.round(area));

    }
}
