package lt.sdacademy.fundamentalscoding.practicalexercisestogether.maxvalue;

import java.util.Scanner;

/*
* .split(",") // tekstas skaidomas per simboly ','
* Integer.parse("") // tekstas verciamas skaiciumi
* 1. Ivedami skaiviai sveiki skaiciai, atskiriami kableliu
* 2. Skaiciai atskiriami i tekstini masyva su funkcija .split(",")
* 3. Tekstines reiksmes skaiciai paverciami int tipo su Integer.parseInt("skaicius")
* 4. Randama didziausia reiksme
* 5. Isspausdinam!
* */

public class MaxValueSearchMain {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite skaičių sarašą");
        String numbersInText = inputScanner.nextLine();
        String[] numberArr = numbersInText.split(",");

        int max = getMax(numberArr);
        System.out.println("Maksimali reikšmė iš sąrašo yra: " + max);
    }

    private static int getMax(String[] numberArr) {
        int max = Integer.parseInt(numberArr[0]);
        for (String s : numberArr) {
            int number = Integer.parseInt(s);
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

}
