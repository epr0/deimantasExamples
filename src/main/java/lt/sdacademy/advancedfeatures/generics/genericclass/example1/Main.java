package lt.sdacademy.advancedfeatures.generics.genericclass.example1;

import java.math.BigDecimal;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Car car = new Car();

        GenericBox<Car> boxWithCarInIt = new GenericBox(car);
        boxWithCarInIt.setItem(new Car(1));
        System.out.println(boxWithCarInIt.getItem());

        GenericBox box = new GenericBox();
        box.setItem("bla");
        box.setItem(BigDecimal.valueOf(42));
        box.setItem(new Car());

        System.out.println(box.getItem());
    }
}
