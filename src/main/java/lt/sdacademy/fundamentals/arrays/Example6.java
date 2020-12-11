package lt.sdacademy.fundamentals.arrays;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Example6 {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {12, 43, 1, 4, 76, 54};

        Arrays.sort(arrayOfNumbers);

        System.out.println(Arrays.toString(arrayOfNumbers));

        String[] arrayOfStrings = {"Tomas", "Paulius", "Sandra", "Ruta", "Onute", "Edgaras"};

        Arrays.sort(arrayOfStrings);
        System.out.println(Arrays.toString(arrayOfStrings));

        Date[] arrayOfDates = {new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(),
                new GregorianCalendar(2016, Calendar.JANUARY, 8).getTime(),
                new GregorianCalendar(2020, Calendar.JUNE, 12).getTime()};

        Arrays.sort(arrayOfDates);
        System.out.println(Arrays.toString(arrayOfDates));
    }
}
