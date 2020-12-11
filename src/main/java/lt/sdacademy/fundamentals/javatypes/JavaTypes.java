package lt.sdacademy.fundamentals.javatypes;

import java.util.ArrayList;
import java.util.List;

public class JavaTypes {
    public static void main(String[] args) {

        //8 bits / 1 byte
        //can store chars
        //range -128 to 127
        //ascii table values
        byte bitas = 3;
        System.out.println("Bitas: " + bitas);

        //16 bits / 2 bytes
        //used for small numbers
        //range -32768 to 32767
        short shortNumber = 5;
        System.out.println("Trumpas skaicius: " + shortNumber);

        // Sveikas skaičius
        int number = 2; //32 bits / 4 bytes
        System.out.println("Sveikas skaičius: " + number);

        long longNumber = 4345434356767L; //64 bits / 8 bytes
        System.out.println("Ilgasis skaicius: " + longNumber);


        //Floating point - 7 skaitmenys po kablelio // 32 bits
        float floatNumber = 5.5f;
        System.out.println("Float: " + floatNumber);

        // Dvejatainis skaičius - tikslesnis, 14 skaitmenu po kalbelio //64 bits
        double doubleNumber = 2.3;
        System.out.println("Dvejatainis skaičius: " + doubleNumber);
        double value = 200.3456;
        System.out.printf("Value: %.2f", value);
        System.out.println();

        // Simbolis // 16 bits
        // Used to store unicode
        char character = 'a';
        System.out.println("Simbolis: " + character);
        character = 'b';
        System.out.println("simbolis : " + character);
        character = '1';
        System.out.println(character);

        // Loginis kintamasis // 1 bit
        boolean isSunday = true;
        System.out.println("Loginis kintamasis: " + isSunday);
        // Tekstinis objektas
        String eilute = "Today is Sunday";
        System.out.println("Tekstinis objektas: " + eilute);

        // Skaičių masyvas su nustatomu dydžiu
        int[] intArrayWithSize = new int[2];
        intArrayWithSize[0] = 2;
        intArrayWithSize[1] = 1;
        System.out.println("Skaičių masyvas su nustatomu dydžiu: " + intArrayWithSize.length);

        // Skaičių sąrašas su nežinomu dydžiu
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        System.out.println("Skaičių sąrašas su nežinomu dydžiu: " + ints.get(0));

        // Exceptionai
        int[] intArray = new int[2];
        try {
            intArray[0] = 2;
            intArray[1] = 1;
            intArray[2] = 3;
            intArray[5] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Virsytas masyvo dydis" + e);
        }

        System.out.println("Programa veikia");

    }
}
