package lt.sdacademy.homework.dog.refactored;

import lt.sdacademy.homework.dog.Dog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DogMainRefactored {

    public static void main(String[] args) {
        List<Dog> dogList = readFile();

        System.out.println("Vyriausio šuns vardas: " + findOldestDog(dogList));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(dogList));

    }

    private static List<Dog> readFile() {
        List<Dog> dogList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/deimantas/IdeaProjects/SDA/SdaAcademy/src/lt/sdacademy/fundamentals/dog/DogsData.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                dogList.add(mapDataToModel(line));
                line = bufferedReader.readLine();
            }

            return dogList;

        } catch (IOException e) {
            System.out.println("Įvyko klaida nuskaitant failą!");
        }
        return null;
    }

    private static Dog mapDataToModel(String lineData) {
        String[] splitedData = lineData.split(",");
        return new Dog(splitedData[0], Integer.parseInt(splitedData[1]), splitedData[2]);
    }

    private static String findOldestDog(List<Dog> dogList) {
        /*return dogList.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .get()
                .getName();*/

        String oldestDogName = "";
        int oldestDog = dogList.get(0).getAge();

        for (Dog dog : dogList) {
            if (oldestDog <= dog.getAge()) {
                oldestDog = dog.getAge();
                oldestDogName = dog.getName();
            }
        }

        return oldestDogName;
    }

    private static double findAverageYearOfDogs(List<Dog> dogList) {
        double averageYear = 0;

        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }

        return averageYear / dogList.size();
    }
}
