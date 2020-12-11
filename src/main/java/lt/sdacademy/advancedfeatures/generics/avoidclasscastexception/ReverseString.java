package lt.sdacademy.advancedfeatures.generics.avoidclasscastexception;

public class ReverseString implements RevertString<Object> {

    @Override
    public String reverseString(Object o) {
        return new StringBuilder(o.toString()).reverse().toString();
    }
}
