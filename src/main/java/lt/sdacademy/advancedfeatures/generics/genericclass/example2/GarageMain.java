package lt.sdacademy.advancedfeatures.generics.genericclass.example2;

public class GarageMain {

    public static void main(String[] args) {
        Car car = new Car();
        Garage<Car> garage = new Garage<>(car);
        garage.repairVehicle();

        MotorCycle motorCycle = new MotorCycle();
        Garage<MotorCycle> garage1 = new Garage<>(motorCycle);
    }
}
