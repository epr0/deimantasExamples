package lt.sdacademy.fundamentals.object_oriented.classes;

public class RobotTester {

    public static void main(String[] args) {
        Robot pirmasisRobotas = new Robot();
        System.out.println(pirmasisRobotas.name);
        pirmasisRobotas.name = "Tomas";
        System.out.println(pirmasisRobotas.name);

        Robot antrasRobotas = new Robot();
        antrasRobotas.name = "Edvinas";
        antrasRobotas.sayHello();

        pirmasisRobotas.dance(antrasRobotas.name);

    }
}
