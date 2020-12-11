package lt.sdacademy.advancedfeatures.generics.genericclass.example1;

public class Car {

    private int engine;

    public Car(int engine) {
        this.engine = engine;
    }

    public Car() {
    }

    public static void main(String[] args) {
        Car car = new Car();

        GenericBox<Car> boxWithCarInIt = new GenericBox<>(car);
    }

}
