package lt.sdacademy.advancedfeatures.inheritance.abstractexamples;

public abstract class Vehicle {
    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Fields values: maxSpeed=" + maxSpeed;
    }
}