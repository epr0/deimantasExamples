package lt.sdacademy.fundamentals.arrays;

import java.util.Arrays;

public class Example8 {

    // Program to convert int array to Integer array in Java
    public static void main (String[] args)
    {
        int[] primitiveArray = { 1, 2, 3, 4, 5 };

        Integer[] boxedArray = new Integer[primitiveArray.length];

        for (int i = 0; i < primitiveArray.length; i++) {
            boxedArray[i] = Integer.valueOf(primitiveArray[i]);
        }

        System.out.println(Arrays.toString(boxedArray));

        //java 8

        int[] primitiveArrayJava8 = { 1, 2, 3, 4, 5 };

        Integer[] boxedArrayJava8 = Arrays.stream(primitiveArrayJava8) // IntStream
                .boxed()				// Stream<Integer>
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(boxedArrayJava8));
    }
}
