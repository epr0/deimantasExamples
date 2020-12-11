package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.basics.task5;

import org.apache.commons.lang.StringUtils;

public class Task5 {

    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("Tom", "1991-06-15", "28");
        people[1] = new Person("Dug", "1993-06-15", "26");
        people[2] = new Person("Bill", "1990-06-15", "29");

        System.out.println("------------------------------------------------");
        System.out.printf("|%s|%s|%s|%n",
                StringUtils.center("Name", 22),
                StringUtils.center("Birth Date", 16),
                StringUtils.center("Age", 6));
        System.out.println("------------------------------------------------");

        for(int i = 0; i < people.length; i++) {
            System.out.printf("|%s", StringUtils.center(people[i].name, 22));
            System.out.printf("|%s", StringUtils.center(people[i].birthDate, 16));
            System.out.printf("|%s|", StringUtils.center(people[i].age, 6));
            System.out.println();
            System.out.println("------------------------------------------------");
        }

    }
}

class Person {
    String name;
    String birthDate;
    String age;

    Person(String name, String birthDate, String age) {
        this.name = name;
        this.birthDate = birthDate;
        this.age = age;

    }
}
