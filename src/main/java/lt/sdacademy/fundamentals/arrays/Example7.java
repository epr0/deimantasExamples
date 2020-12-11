package lt.sdacademy.fundamentals.arrays;

public class Example7 {

    public static void main(String[] args) {
        int integerPrimityvas = 3;
        Integer integerObjektas = new Integer(5);
        System.out.println(integerObjektas > 3);
        Integer autoboxedInteger = integerPrimityvas;
        Integer parsedAutoboxedInteger = Integer.parseInt("5"); //returns primitive autoboxed Integer
        int parsedPrimitiveInteger = Integer.parseInt("5"); //returns primitive integer
        Integer integerObjektas2 = Integer.valueOf(7);
        //System.out.println(parsedAutoboxedInteger.equals(parsedPrimitiveInteger));

        int unboxedInt = integerObjektas2.intValue();

        int[] primityvuMasyvas = {1, 2, 3, 4, 5};

        System.out.println("Primityvu masyvas");
        for (int i = 0; i < primityvuMasyvas.length; i++) {
            System.out.println(primityvuMasyvas[i]);
        }

        System.out.println("");
        System.out.println("Objektu masyvas");
        Integer[] integerObjectMasyvas = new Integer[] {1, 2, 3, 4, 5};
        for (Integer elementas : integerObjectMasyvas) {
            System.out.println(elementas);
        }

        System.out.println("");
        System.out.println("Lyginame objektus");
        System.out.println(primityvuMasyvas.equals(integerObjectMasyvas));
        System.out.println("");
        System.out.println("Lyginame reiksmes");
        // == for primitives and booleans, equals for objects
        System.out.println(primityvuMasyvas[0] == integerObjectMasyvas[0]); //Unboxing
        System.out.println(integerObjectMasyvas[0].equals(primityvuMasyvas[0])); //Autoboxing
        System.out.println("");
        //other compares
        System.out.println("Ankstesni palyginimai");
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        String s1 = new String("GEEKS");
        String s2 = new String("GEEKS");

        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(s1 == s2);

        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2));

    }

}
