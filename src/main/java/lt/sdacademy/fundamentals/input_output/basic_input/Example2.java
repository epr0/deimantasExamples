package lt.sdacademy.fundamentals.input_output.basic_input;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Galiu sudėti 2 int tipo skaičius!");
        System.out.println("Įveskite pirmą skaičių: ");
        int firstValue = scanner.nextInt();
        System.out.println("Įveskite antrą skaičių: ");
        int secondValue = scanner.nextInt();
        System.out.println("Dviejų skaičių suma: " + (firstValue + secondValue));

    }

}
