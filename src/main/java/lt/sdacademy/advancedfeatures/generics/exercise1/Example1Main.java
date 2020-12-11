package lt.sdacademy.advancedfeatures.generics.exercise1;

import java.util.Arrays;
import java.util.List;

public class Example1Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "B", "C", "d");
        List<Integer> integers = Arrays.asList(2, 999, 12, -22);

        System.out.println(GenericMethodMain.lastEntry(strings));
        System.out.println(GenericMethodMain.lastEntry(integers));
    }
}
