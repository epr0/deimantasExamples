package lt.sdacademy.homework.car.refactored;

import lt.sdacademy.homework.car.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarMainRefactored {

    public static void main(String[] args) {
        List<Car> carList = readFile();

        System.out.println("Naujausias automobilis: " + findNewestCar(carList));
        System.out.println("Vidutinis automobilių amžius: " + findAverageCarsYear(carList));
        System.out.println("Brangiausias automobilis: " + findMostExpensiveCar(carList));

    }

    private static List<Car> readFile() {
        List<Car> carList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/deimantas/IdeaProjects/SDA/SdaAcademy/src/main/java/lt/sdacademy/homework/car/refactored/CarsData.txt"))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                carList.add(mapDataToModel(line));
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Įvyko klaida nuskaitant failą!");
        }
        return carList;
    }

    private static Car mapDataToModel(String lineData) {
        String[] splitedData = lineData.split(",");
        return new Car(splitedData[0], Integer.parseInt(splitedData[1]), Integer.parseInt(splitedData[2]), Double.parseDouble(splitedData[3]), splitedData[4]);
    }

    private static String findNewestCar(List<Car> carList) {
        /*return carList.stream()
                .max(Comparator.comparingInt(Car::getYear))
                .get()
                .toString();*/

        int newestCarMadeIn = carList.get(0).getYear();
        for (Car car : carList) {
            newestCarMadeIn = Math.max(newestCarMadeIn, car.getYear());
        }

        return String.valueOf(newestCarMadeIn);
    }

    private static double findAverageCarsYear(List<Car> carList) {
        int carsYearSum = 0;

        for (Car car : carList) {
            carsYearSum += car.getYear();
        }

        return (double) carsYearSum / carList.size();
    }

    private static String findMostExpensiveCar(List<Car> carList) {
        /*return carList.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .get()
                .toString();*/

        double mostExpensiveCar = carList.get(0).getPrice();
        for (Car car : carList) {
            mostExpensiveCar = Math.max(mostExpensiveCar, car.getPrice());
        }

        return String.valueOf(mostExpensiveCar);
    }
}
