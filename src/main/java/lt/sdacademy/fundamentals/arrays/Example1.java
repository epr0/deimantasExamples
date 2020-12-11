package lt.sdacademy.fundamentals.arrays;

public class Example1 {

    public static void main(String[] args) {

        int[] arrayOfInts = new int[5];
        // Inicializavimas
        arrayOfInts[0] = 10;
        arrayOfInts[1] = 15;
        arrayOfInts[2] = 20;
        arrayOfInts[3] = 25;
        arrayOfInts[4] = 30;

       // System.out.println(arrayOfInts[3]);

       /* for(int value: arrayOfInts) {
            System.out.println(value);
        }*/

        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i]);
        }
    }
}