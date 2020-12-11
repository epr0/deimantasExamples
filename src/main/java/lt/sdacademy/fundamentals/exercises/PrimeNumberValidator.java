package lt.sdacademy.fundamentals.exercises;

import java.util.Scanner;

public class PrimeNumberValidator {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int inputNumber = scanner.nextInt();

        int m=0;
        boolean isPrime = true;
        m = inputNumber / 2;
        if(inputNumber == 0 || inputNumber == 1){
            System.out.println(inputNumber + " Tai ne pirminis skaicius.");
        }else{
            for(int i = 2; i <= m; i++){
                if(inputNumber % i == 0){
                    System.out.println(inputNumber + " is not prime number");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)  {
                System.out.println(inputNumber + " is prime number");
            }
        }//end of else
    }

}
