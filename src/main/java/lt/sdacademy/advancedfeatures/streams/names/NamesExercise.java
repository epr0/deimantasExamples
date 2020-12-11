package lt.sdacademy.advancedfeatures.streams.names;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NamesExercise {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Romualdas", "Agnė", "Elena", "Angelė", "Laurynas", "Meda", "Karolis", "Bronius", "Ignė");

        Optional<String> name = names.stream()
                .filter(n -> n.length() < 6)
                .filter(n -> n.contains("e"))
                .peek(n -> System.out.println(n.toUpperCase()))
                .sorted(Comparator.reverseOrder())
                .findFirst();

        System.out.println("Vardas atitinkantis standartus: " + name.orElse("nerastas"));
    }
}
