package lt.sdacademy.advancedfeatures.generics.avoidclasscastexception;

public class AvoidClassCastException {

    public static void main(String[] args) {
        Object object = 42;
        ReverseString obj = new ReverseString();

        System.out.println(obj.reverseString(object));
    }
}