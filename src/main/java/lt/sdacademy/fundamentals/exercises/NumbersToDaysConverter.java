package lt.sdacademy.fundamentals.exercises;

import java.util.Scanner;

public class NumbersToDaysConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite skaiciu, kuris atitiktu savaites diena :");
        int skaicius = scanner.nextInt();

        // Using nested-if
        if (skaicius == 1) {   // Use == for comparison
            System.out.println("Pirmadienis.");
        } else if (skaicius == 2) {
            System.out.println("Antradienis.");
        } else if (skaicius == 3) {
            System.out.println("Treciadienis.");
        } else if (skaicius == 4) {
            System.out.println("Ketvirtadienis.");
        } else if (skaicius == 5) {
            System.out.println("Penktadienis.");
        } else if (skaicius == 6) {
            System.out.println("Sestadienis.");
        } else if (skaicius == 7) {
            System.out.println("Sekmadienis.");
        } else {
            System.out.println("Tokios dienos nera");
        }
    }

}
