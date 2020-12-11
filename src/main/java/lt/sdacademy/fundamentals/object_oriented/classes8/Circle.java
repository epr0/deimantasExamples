package lt.sdacademy.fundamentals.object_oriented.classes8;

public class Circle {
    // private tipo kintamasis, neprieinamas is uz klases ribu. (prieinamas tik sioje klaseje)
    private double radius;
    private String color;

    // Default konstruktorius su default reiksmemis.
    // Priskiria apskritimo spinduli ir spalva
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // Antrasis konstruktorius priima spinduli kaip parametra, taciau spalva nustato by default
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // public (viesas) argumentas skirtas gauti spindulio reiksme.
    public double getRadius() {
        return radius;
    }

    // public metodas skirtas apskaiciuoti apskritimo plota. py er kvadratu.
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
