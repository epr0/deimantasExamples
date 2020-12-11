package lt.sdacademy.fundamentals.object_oriented.classes3;

public class RobotAndPersonTester {

    public static void main(String[] args) {
        Robot robot = new Robot("Ted");
        robot.vardas = "Robotas Policininkas";
        robot.spalva = "Raudona";
        robot.svoris = 50;
        robot.sayHello();
        robot.sayProperties();

        Robot robot2 = new Robot("Tommy");
        robot2.spalva = "Raudomas";

        Person person = new Person("Thomas", "Calm", false, robot);
        Person person2 = new Person("edvinas", "Aggresive", false, robot);
        System.out.println(person.robotOwned);

        person.robotOwned.sayProperties();
        System.out.println(person.robotOwned.toString());
        System.out.println(person.name);
        System.out.println(person.personality);
        System.out.println(person.isSitting);
        person.sitDown();
        System.out.println(person.isSitting);
    }

}




