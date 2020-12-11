package lt.sdacademy.fundamentals.date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Example1 {

    public static void main(String[] args) {


        long millis = System.currentTimeMillis();
        Date now = new Date(millis);
        System.out.println(now); // Treč Kovo 13 21:38:09 2019

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime(); // konvertuojamas Calendar objektas į Date objektą
        System.out.println(date); // Treč Kovo 13 21:38:09 2019

        cal.setTime(now); // konvertuojamas Date objektas į Calendar objektą

        System.out.println(cal.get(Calendar.YEAR)); // 2019
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // 72
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // 11

        String dateInText = "2019.02.18";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        LocalDate localDate = LocalDate.parse(dateInText, dateTimeFormatter);
        System.out.println(localDate.plusDays(2));

    }

}
