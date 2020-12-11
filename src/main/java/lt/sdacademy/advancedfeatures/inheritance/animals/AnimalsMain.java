package lt.sdacademy.advancedfeatures.inheritance.animals;

import java.util.Arrays;
import java.util.List;

public class AnimalsMain {

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Cat(true, "miau", "white"),
                new Dog(true, "whaf", "black"),
                new Cat(false, "miau", "brown")
        );

//        Can't initialise abstract class
//        Animal falseAnimal = new Animal(true, "test");

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.yieldVoice());
        }
    }
}
