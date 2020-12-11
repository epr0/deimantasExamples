package lt.sdacademy.advancedfeatures.annotations.custom;

public class CustomAnnotationTestClass {

    @MyAnnotation(name = "Deimantas", age = 24)
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
