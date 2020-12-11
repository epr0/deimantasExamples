package lt.sdacademy.fundamentals.arrays;

public class Example5 {

    public static void main(String args[]) {


        int daugybosLentele[][] = new int[10][10];
        int eilute = 1, stulpelis = 1;

        for (int i = 0; i < daugybosLentele.length; i++) {
            for (int j = 0; j < daugybosLentele.length; j++) {
                daugybosLentele[i][j] = eilute * stulpelis;
                stulpelis = stulpelis + 1;
            }
            eilute = eilute + 1;
            stulpelis = 1;
        }

        for (int i = 0; i < daugybosLentele.length; i++) {
            for (int j = 0; j < daugybosLentele.length; j++) {
                System.out.print(" " + daugybosLentele[i][j] + "\t| ");
            }
            System.out.print("\n");
        }


    }

}
