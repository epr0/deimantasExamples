package lt.sdacademy.fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

    //Nuskaityti vartotojo paduotas reiksmes, sudeti jas i masyva.
    //masyvo dydis 5.



















    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArray));
    }
}
