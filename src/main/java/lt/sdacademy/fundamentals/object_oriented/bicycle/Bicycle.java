package lt.sdacademy.fundamentals.object_oriented.bicycle;

public class Bicycle {

    private int model;
    private int gear;
    private int speed;
    static int count = 0;

    public Bicycle(int model, int gear, int speed) {
        this.model = model;
        this.gear = gear;
        this.speed = speed;
        count++;
    }

    public int getModel() {
        return model;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Bike properties \n\n" + "Model: " + this.getModel() + "\nGear: " + this.getGear() + "\nSpeed: " + this.getSpeed();
    }
}
