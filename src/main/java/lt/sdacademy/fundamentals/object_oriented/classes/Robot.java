package lt.sdacademy.fundamentals.object_oriented.classes;

public class Robot {

    //apsirasom objektu busena/state
    String name;
    String color;
    int weight;
    double version = 1.0;


    //apsirasom objektu elgesi/behaviour
    void sayHello() {
        System.out.println("Labas mano vardas yra " + name);
    }

    void dance(String kitoRobotoVardas) {
        System.out.println("As soku... soku... soku... su " + kitoRobotoVardas);
    }
}
