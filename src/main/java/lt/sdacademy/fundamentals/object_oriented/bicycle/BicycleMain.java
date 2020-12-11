package lt.sdacademy.fundamentals.object_oriented.bicycle;

public class BicycleMain {

    public static void main(String[] args) {

        Bicycle bike = new Bicycle(75, 2, 20);

        bike.getModel(); // grąžinama 75
        System.out.println(bike.getModel()); // išvesta į ekraną 75

        int model = bike.getModel();
        System.out.println("Model is: " + model);
        System.out.println(Bicycle.count); // išvesta į ekraną 1

        Bicycle anotherBike = new Bicycle(80, 4, 25);
        System.out.println(Bicycle.getCount()); // išvesta į ekraną 2

        // abiejuose atvejuose išvedama reikšmė true
        System.out.println(Bicycle.getCount() == bike.count);
        System.out.println(bike.count == anotherBike.count);

        //System.out.println(bike.toString());
    }

}
