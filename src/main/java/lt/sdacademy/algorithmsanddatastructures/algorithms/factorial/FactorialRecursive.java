package lt.sdacademy.algorithmsanddatastructures.algorithms.factorial;

public class FactorialRecursive {

    public static void main(String[] args) {
        int n = 10;
        int result = factorial(n);
        System.out.println(String.format("%d! = %d", n, result));
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
