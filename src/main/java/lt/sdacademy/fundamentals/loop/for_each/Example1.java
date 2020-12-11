package lt.sdacademy.fundamentals.loop.for_each;

public class Example1 {

    public static void main(String[] args) {

        Animal dog = new Animal("Boss", "Boxer");
        Animal cat = new Animal("Dolly", "Ciau ciau");

        Animal[] animals = {dog, cat};

        for (Animal animal: animals) {
            System.out.println(animal.getName());
            System.out.println(animal.getBreed());
        }

    }

}

class Animal {
    // Kintamieji
    private String name;
    private String breed;

    // Konstruktorius
    Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Kintamojo getteris
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

}
