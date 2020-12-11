package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.objects.task2;

public class Gas {

    private double petrol;
    private double price;

    public Gas(double petrol, double price) {
        this.petrol = petrol;
        this.price = price;
    }

    public double getTotalGas() {
        return petrol * price;
    }
}
