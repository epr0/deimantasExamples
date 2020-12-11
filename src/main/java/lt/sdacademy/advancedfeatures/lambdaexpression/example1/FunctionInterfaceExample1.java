package lt.sdacademy.advancedfeatures.lambdaexpression.example1;

import java.util.function.Predicate;

public class FunctionInterfaceExample1 {

    public static void main(String[] args) {
        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));

        Runnable myRunnable = () -> System.out.println("Running a runnable");
        myRunnable.run();
    }
}