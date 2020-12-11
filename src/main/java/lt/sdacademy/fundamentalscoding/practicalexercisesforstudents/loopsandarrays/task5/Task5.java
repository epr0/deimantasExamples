package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.loopsandarrays.task5;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Printing triangle");
        printTriangle();
        emptyLine();

        System.out.println("Printing rectangle");
        printRectangle();
        emptyLine();

        System.out.println("Printing Christmas tree");
        printChristmasTree();
        emptyLine();
    }

    private static void printTriangle() {
        // handle number of rows in the triangle
        int n = 5;
        for (int i=0; i<5; i++) {
            // loop to handle number of spaces
            for (int j=n-i; j>1; j--) {
                // printing spaces
                System.out.print(" ");
            }
            // loop to handle number of columns (stars)
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            emptyLine();
        }
    }

    private static void printRectangle() {
        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            emptyLine();
        }
    }

    private static void printChristmasTree() {
        printTriangle();

        System.out.printf("%5s", "*");
        emptyLine();
        System.out.printf("%5s", "*");
    }

    private static void emptyLine() {
        System.out.println();
    }
}
