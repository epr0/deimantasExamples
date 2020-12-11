package lt.sdacademy.fundamentals.object_oriented.classes3;

public class Robot {

    String vardas;
    String spalva;
    int svoris;

    Robot(String name) {
        this.vardas = name;
    }

    void sayHello() {
        if(null != vardas) {
            System.out.println("Hello, my name is " + vardas);
        } else {
            System.out.println("My name is not specified so you can call me ROBOT");
        }
    }

    void sayProperties() {
        System.out.println("My color is " + spalva + " and my weight is " + svoris);
    }

    @Override
    public String toString() {
        return "Robot characteristics: \nName: " + vardas + "\nColor: " + spalva;
    }
}
