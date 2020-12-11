package lt.sdacademy.fundamentals.exercises;

public class StringChecker {

    public static void main(String[] args) {
        String eilute = "abc123";
        System.out.println(eilute.contains("123"));

        String eilute2 = eilute.replaceAll("abc", "321");
        System.out.println(eilute2);

        int skaicius = 6;
        float skaiciukas = 5.4f;

        System.out.println(Integer.class.isInstance(skaicius));
        System.out.println(Double.class.isInstance(skaicius));
        System.out.println(String.class.isInstance(skaicius));
    }
}
