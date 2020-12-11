package lt.sdacademy.algorithmsanddatastructures.algorithms.fibonacci;

public class FibonacciRecursive {

    public static void main(String[] args) {
        int value = fibonacci(10);
        System.out.println(value);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
