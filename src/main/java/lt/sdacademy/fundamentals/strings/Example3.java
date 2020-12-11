package lt.sdacademy.fundamentals.strings;

public class Example3 {

    public static void main(String[] args)
    {
        String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        char simbolis = str.charAt(10);
        System.out.println(simbolis);

        // Print out the results.
        System.out.println("The character at position 0 is " + (char) index1);
        System.out.println("The character at position 10 is " +
                (char)index2);

        System.out.println("eilutes ilgis " + str.length());
        String slaptazodis = "12345";

        if(slaptazodis.length() > 4) {
            System.out.println("Slaptazodis yra per ilgas");
        }

        String didziosiosRaides = "TOMAS";
        System.out.println(didziosiosRaides.toLowerCase());
        System.out.println(didziosiosRaides.toUpperCase());
    }
}
