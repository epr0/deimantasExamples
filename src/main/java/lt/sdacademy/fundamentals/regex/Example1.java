package lt.sdacademy.fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches(".s", "as")); // true
        System.out.println(Pattern.matches(".t", "dt")); // true
        System.out.println(Pattern.matches(".d", "odt")); // false
        System.out.println(Pattern.matches("..d.", "oodt")); // false
        System.out.println(Pattern.matches("..", "ot")); // true

        // El. pašto validacija
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)\\.(.+)$");
        Matcher emailMatcher = emailPattern.matcher("deim*.saltis@gmail.com");
        System.out.println(emailMatcher.matches()); // true

        String bla = emailMatcher.matches() ? "OK" :"NO";
        System.out.println(bla);
    }

}
