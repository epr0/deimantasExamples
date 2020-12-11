package lt.sdacademy.advancedfeatures.exceptions;

public class ClassCastExceptionExample {

    public static void main(String[] args) {
        Object obj = 42;
        StringBuilder text = new StringBuilder((String) obj);

        System.out.println(reverseText(text));
    }

    private static String reverseText(StringBuilder text) {
        return text.reverse().toString();
    }
}