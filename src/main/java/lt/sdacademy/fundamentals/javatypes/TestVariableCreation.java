package lt.sdacademy.fundamentals.javatypes;

public class TestVariableCreation {

    public static void main(String[] args) {
        int[] c = {1 , 2 , 3};
        int[] d = c;

        d[1] = 5;

        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
