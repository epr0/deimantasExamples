package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.loopsandarrays.task10;


import org.assertj.core.internal.bytebuddy.utility.RandomString;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        String[] randomStrings = buildRandomStringSequences();
        int longestCharSequence = findLongestCharSequence(randomStrings);

        System.out.println("Longest random string " + randomStrings[longestCharSequence]);
    }

    private static String[] buildRandomStringSequences() {
        String[] randomStrings = new String[5];
        int[] randomNumbers = new Random().ints(5, 1, 8).toArray();

        for (int i = 0; i < 5; i++) {
            randomStrings[i] = RandomString.make(randomNumbers[i]);
            System.out.println(randomStrings[i]);
        }
        return randomStrings;
    }

    private static int findLongestCharSequence(String[] randomStrings) {
        int longestStringIndex = 0;

        for (int i = 0; i < randomStrings.length; i++) {
            if (randomStrings[longestStringIndex].length() < randomStrings[i].length()) {
                longestStringIndex = i;
            }
        }
        return longestStringIndex;
    }
}
