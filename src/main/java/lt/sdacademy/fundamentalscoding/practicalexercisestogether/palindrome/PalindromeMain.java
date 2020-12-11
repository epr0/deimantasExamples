package lt.sdacademy.fundamentalscoding.practicalexercisestogether.palindrome;

public class PalindromeMain {

    public static void main(String[] args) {

        for (String word : args) {
            if (isPalindrome(word)) {
                System.out.println("Žodis: " + word + " yra palindromas");
            } else {
                System.out.println("Žodis: " + word + " nėra palindromas");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
