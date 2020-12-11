package lt.sdacademy.advancedfeatures.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.remove("Paris");

        for (String country : travelRoute) {
            System.out.print(country + " ");
        }
    }
}
