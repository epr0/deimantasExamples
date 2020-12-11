package lt.sdacademy.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FilterAndMapExample {

    private static final Logger logger = Logger.getLogger(FilterAndMapExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        // Filter
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(logger::info);

        // Map
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        logger.info(nameLengths);

        OptionalDouble averageNameLengthOptional = names.stream()
                .mapToInt(String::length)
                .average();
        logger.info(averageNameLengthOptional.orElse(0));
        // Use decimal format to round number

    }
}
