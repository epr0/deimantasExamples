package lt.sdacademy.fundamentalscoding.practicalexercisestogether.windspeed;

import java.util.Scanner;

/*
* 1. Ivedamas vejo greitis km/h
* 2. Paverciamas vejo greitis is km/h -> greitis mazgais
* 3. Vejo greiti Beuforto skaleje Math.pow(greitis, laipsnis) Beuforto skales formule = (vejo greitis km/h : 3.01 ^ 1.5)
* 3.1 Beuforto skales matmuo negali buti didesnis nei 12
* 4. Jei vejo greitis didesnis nei 20km -> stiprus
* 4. Atspausdinti rezultatus
* */

public class WindSpeedMain {

    private static final double NAUTIC_MILE = 1.852;
    private static final double BEAUFORT_CONSTANT = 3.01;

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite vėjo greitį km/h");
        int windSpeedKilometersPerHour = inputScanner.nextInt();

        System.out.println("Vėjo greitis mazgais: " + kilometersPerHourToKnots(windSpeedKilometersPerHour));
        System.out.println("Vėjo greitis Beauforto skalėje: " + kilometersPerHourToBeaufortScale(windSpeedKilometersPerHour));
        System.out.println("Vėjo stiprumas: " + getWindStrength(windSpeedKilometersPerHour));
    }

    private static int kilometersPerHourToKnots(int windSpeed) {
        return (int) (NAUTIC_MILE * windSpeed);
    }

    private static int kilometersPerHourToBeaufortScale(int windSpeed) {
        int beaufort = (int) Math.pow(windSpeed / BEAUFORT_CONSTANT, 1.5);
        return Math.min(beaufort, 12);
    }

    private static String getWindStrength(int windSpeed) {
        return windSpeed <= 20 ? "ramus" : "stiprus";
    }
}
