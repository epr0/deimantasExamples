package lt.sdacademy.homework.dog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DogMain {

    private static final String FILE_LOCATION = "/Users/deimantas/IdeaProjects/SDA/SdaAcademy/src/lt/sdacademy/homework/dog/refactored/DogsData.txt";

    public static void main(String[] args) {
        List<Dog> dogList = getDogsFromFile();

        System.out.println("Vyriausio šuns vardas: " + findOldestDog(dogList));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(dogList));

    }

    private static List<Dog> getDogsFromFile() {
        List<Dog> dogList = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();

            while (line != null) {
                String[] splitedLine = line.split(",");
                dogList.add(mapDataToObject(splitedLine));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("KLAIDA");
        }
        return dogList;
    }

    private static Dog mapDataToObject(String[] dogsData) {
        return new Dog(dogsData[0], Integer.parseInt(dogsData[1]), dogsData[2]);
    }

    private static String findOldestDog(List<Dog> dogList) {
       /*return dogList.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .get()
                .getName();*/

        String oldestDogName = dogList.get(0).getName();
        int oldestDog = dogList.get(0).getAge();

        for (Dog dog : dogList) {
            if (oldestDog < dog.getAge()) {
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
