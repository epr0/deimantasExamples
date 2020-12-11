package lt.sdacademy.advancedfeatures.inheritance.abstractexamples;

public class ExampleMain {

    public static void main(String[] args) {
        Car myCar = new Car(130);
        System.out.println(myCar.toString());

        Vehicle myCarVehicle = new Car(210);

//        Can't initialise abstract class
//        Vehicle vehicle = new Vehicle(1);

    }
}
