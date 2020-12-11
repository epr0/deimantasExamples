package lt.sdacademy.fundamentals.operators;

public class Operators {

    public static void main(String[] args) {
        int x = 4;

        String eilute1 = "Eilute";
        String eilute2 = "Antra eilute";
        System.out.println(eilute1.equals(eilute2));

        System.out.println(7 % x++);
        System.out.println(x);

        System.out.println("abc" instanceof String);

        System.out.println(x++);
        System.out.println(--x);

        System.out.println(x % 3);
        System.out.println(11 % 2);

        System.out.println(7 % x++); //x = 3
        System.out.println(x == 4);
        System.out.println(x != 4); // x = 3
        x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5);
        System.out.println(x <= y && y > 5);
        System.out.println(x == 10 || y > 5);


        System.out.println("abc" instanceof String);

        int a = 5;
        a = a + 1; // or a += 1
        System.out.println(a);

        int b = 2;
        int c = 5;
        b *= c;
        System.out.println(b);
    }
}
