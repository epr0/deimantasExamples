package lt.sdacademy.fundamentals.arrays;

import java.util.Arrays;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {

        int[] arrayOfInts = {10, 15, 20, 25, 30};

        System.out.println(arrayOfInts[0]); // prints 10
        System.out.println(arrayOfInts[2]); // prints 20
        System.out.println(arrayOfInts[4]); // prints 30

        // Išspausdins 10 15 20 25 30
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
        }

        System.out.println(); // Spausdinama tuščia eilutė

        // Išspausdins 10 15 20 25 30
        for(int i : arrayOfInts) {
            System.out.print(i + " ");
        }

        System.out.println();

        List<Integer> integerList = Arrays.asList(10, 15, 20, 25, 30);
        integerList.forEach(number -> System.out.print(number + " "));

    }
}
