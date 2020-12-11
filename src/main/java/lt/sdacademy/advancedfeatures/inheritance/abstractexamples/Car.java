package lt.sdacademy.advancedfeatures.inheritance.abstractexamples;

public class Car extends Vehicle {
    private String name;

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    public int getParentHiddenField() {
        return maxSpeed;
    }
}
