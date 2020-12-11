package lt.sdacademy.fundamentalscoding.practicalexercisestogether.fibonaccinumber;

import java.util.Scanner;

public class FibonacciSequenceMain {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite Fibonaci sekos numerį");
        int number = inputScanner.nextInt();

        int result = fib(number);

        System.out.println(result);
    }

    private static int fib(int n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
