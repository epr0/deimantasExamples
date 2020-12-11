package lt.sdacademy.fundamentals.object_oriented.classes8;

public class TestCircle {

    public static void main(String[] args) {
        // Susikuriame apskritimo Circle instance
        // sukonstruojame objekta iskviesdami default konstruktoriu
        // kuris iskarto priskiria default spindulio ir spalvos reiksmes.
        Circle c1 = new Circle();
        // iskvieciame public metodus
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        // Sukuriame antro Circle instance
        // Iskvieciame antraji konstruktoriu
        Circle c2 = new Circle(2.0);
        // iskvieciame public metodus
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
    }
}