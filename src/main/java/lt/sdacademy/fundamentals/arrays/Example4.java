package lt.sdacademy.fundamentals.arrays;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        int[] specificArray = new int[3];

        specificArray[0] = 123;
        specificArray[1] = 345;
        specificArray[2] = 678;

        for(int i = 0; i < specificArray.length; i++) {
            System.out.println("reiksme:  " + specificArray[i]);

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("o dabar iveskite masyvo dydi: ");
        int arraySize = scanner.nextInt();

        int[] userArray = new int[arraySize];

        System.out.println();
        System.out.println("o dabar iveskite masyvo reiksmes : ");

        for(int i = 0; i < arraySize; i++) {
            System.out.print(i + " reiksme:  ");
            userArray[i] = scanner.nextInt();
        }

        for(int i = 0; i < arraySize; i++) {
            System.out.println("reiksme nr. " + userArray[i]);

        }
    }
}
