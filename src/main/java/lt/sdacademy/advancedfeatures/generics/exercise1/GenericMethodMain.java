package lt.sdacademy.advancedfeatures.generics.exercise1;

import java.util.List;

public class GenericMethodMain {

    public static <T> T lastEntry(List<T> list) {
        return list.get(list.size() - 1);
    }
}