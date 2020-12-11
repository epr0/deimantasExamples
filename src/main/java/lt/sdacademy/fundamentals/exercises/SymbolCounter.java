package lt.sdacademy.fundamentals.exercises;

import java.util.Scanner;

public class SymbolCounter {

    /*
    Write a Java program to count the letters, spaces, numbers and other characters of an input string.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite eilute");
        String eilute = scanner.nextLine();
        skaiciuotiSimbolius(eilute);

    }
    public static void skaiciuotiSimbolius(String eilute){
        char[] simboliuMasyvas = eilute.toCharArray();
        int raides = 0;
        int tarpai = 0;
        int skaiciai = 0;
        int kitiSimboliai = 0;
        for(int i = 0; i < eilute.length(); i++){
            if(Character.isLetter(simboliuMasyvas[i])){
                raides ++ ;
            }
            else if(Character.isDigit(simboliuMasyvas[i])){
                skaiciai ++ ;
            }
            else if(Character.isSpaceChar(simboliuMasyvas[i])){
                tarpai ++ ;
            }
            else{
                kitiSimboliai ++;
            }
        }
        System.out.println("Pateikta eilute buvo : " + eilute);
        System.out.println("Raides: " + raides);
        System.out.println("Tarpai: " + tarpai);
        System.out.println("Skaiciai: " + skaiciai);
        System.out.println("Kiti simboliai: " + kitiSimboliai);
    }
}
