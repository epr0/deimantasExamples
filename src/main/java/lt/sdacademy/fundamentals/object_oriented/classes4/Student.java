package lt.sdacademy.fundamentals.object_oriented.classes4;

public class Student {

    String name;
    int grade;
    int course;

    void goLearnJava() {
        System.out.println("I am learning JAVA...");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.goLearnJava();
    }
}


