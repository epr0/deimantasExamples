package lt.sdacademy.fundamentals.exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessRandom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = -2;
        int guess = -1;

        while (randomNumber != guess){
            randomNumber = new Random().nextInt(5);
            System.out.println("Atspek skaiciu : ");
            guess = scanner.nextInt();

            if(guess == randomNumber) {
                System.out.println("Atspejai!");
            } else {
                System.out.println("Random skaicius buvo " + randomNumber);
                System.out.println("Bandyk dar karta");
            }
        }



    }
}
