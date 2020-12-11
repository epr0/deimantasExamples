package lt.sdacademy.advancedfeatures.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("Spain");
        visitedCountries.add("France");
        visitedCountries.add("Spain");
        visitedCountries.remove("France");

        for (String country : visitedCountries) {
            System.out.print(country + " ");
        }
    }
}
