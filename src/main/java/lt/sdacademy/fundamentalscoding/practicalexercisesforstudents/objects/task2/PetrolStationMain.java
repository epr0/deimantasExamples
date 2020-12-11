package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.objects.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetrolStationMain {

    public static void main(String[] args) {
        List<Gas> gasList = new ArrayList<>();

        refuel(gasList);
        payForGas(gasList);
    }

    private static void refuel(List<Gas> gasList) {
        Scanner inputScanner = new Scanner(System.in);
        boolean proceed = true;

        while (proceed) {
            System.out.println("Įveskite kuro kainą");
            double price = inputScanner.nextDouble();

            System.out.println("Įveskite litražą");
            double petrol = inputScanner.nextDouble();

            gasList.add(new Gas(petrol, price));

            System.out.printf("Kuro kaina: %.2f, litražas: %.2f \n", price, petrol);
            inputScanner.nextLine();

            System.out.println("Jei norite toliau pilti kurą įveskite 'continue', kitu atveju bet kokį tekstą");
            String userAnswer = inputScanner.nextLine();

            proceed = userAnswer.equalsIgnoreCase("continue");
        }
    }

    private static void payForGas(List<Gas> gasList) {
        Scanner totalAmountScanner = new Scanner(System.in);
        double totalAmountForGas = totalAmountForGas(gasList);

        System.out.println("Susimokėkite už kurą");
        double userPaidAmount = totalAmountScanner.nextDouble();

        if (userPaidAmount < totalAmountForGas) {
            System.out.printf("Sumokėjote per mažai!!! Trūksta: " + (totalAmountForGas - userPaidAmount));
        } else if (userPaidAmount > totalAmountForGas) {
            System.out.printf("Sumokėjote per daug. Grąžinama suma: " + (userPaidAmount - totalAmountForGas));
        } else {
            System.out.printf("Sumokėjote lygiai. Gražios dienos!");
        }

    }

    private static double totalAmountForGas(List<Gas> gasList) {
        double totalAmount = 0;

        for (Gas gas : gasList) {
            totalAmount += gas.getTotalGas();
        }
        return totalAmount;
    }
}
