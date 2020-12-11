package lt.sdacademy.advancedfeatures.lambdaexpression.example1;

import java.util.function.Function;

public class FunctionInterfaceExample2 {

    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("ABCDE"));

        Function<String, String> replaceCommasWithDots = s -> s.replaceAll(",", ".");
        System.out.println(replaceCommasWithDots.apply("a,b,c"));
        System.out.println(replaceAll("a,b,c"));
    }

    private static String replaceAll(String word) {
        return word.replaceAll(",", ".");
    }
}
