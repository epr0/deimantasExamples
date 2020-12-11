package lt.sdacademy.fundamentals.object_oriented.car;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner carScanner = new Scanner(System.in);

        System.out.println("Car model");
        String model = carScanner.nextLine();

        System.out.println("Run and drive, YES : NO");
        String isRunning = carScanner.nextLine();

        System.out.println("Engine size");
        double engineSize = carScanner.nextDouble();

        System.out.println("Doors");
        int numberOfDoors = carScanner.nextInt();

        boolean isCarRunning = isCarRunning(isRunning);

        Car car = new Car(model, engineSize, numberOfDoors, isCarRunning);
        printCarModel(car);

        Car biggerCar = new Car(model, engineSize + 1, numberOfDoors + 1, isCarRunning);
        printCarModel(biggerCar);
    }

    private static void printCarModel(Car car) {
        System.out.println("Doors: " + car.getNumberOfDoors());
    }

    private static boolean isCarRunning(String isRunning) {
        if (isRunning.equals("YES")) {
            return true;
        } else {
            return false;
        }
    }
}
