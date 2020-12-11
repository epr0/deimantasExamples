package lt.sdacademy.fundamentals.object_oriented.car;

public class Car {
    private String model;
    private double engine;
    private int numberOfDoors;
    private boolean isRunAndDrive;

    public Car(String m, double e, int n, boolean i) {
        model = m;
        engine = e;
        numberOfDoors = n;
        isRunAndDrive = i;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isRunAndDrive() {
        return isRunAndDrive;
    }
}
