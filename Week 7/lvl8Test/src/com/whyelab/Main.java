package com.whyelab;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //create dates from strings
        try {
            //LocalDate d0 = LocalDate.parse("agfjkngewg 2019-12-01");
            LocalDateTime dt = LocalDateTime.parse("2007-12-03T10:15");
            System.out.println(dt.format(DateTimeFormatter.ofPattern("MMM d yyyy")));
            System.out.println(dt.getHour() + " " + dt.getMinute());
        } catch (DateTimeParseException e) {
            System.out.println("No go");
        }

        LocalDate d1 = LocalDate.parse("2019-12-01");
        LocalDate d2 = LocalDate.parse("2019-12-02");
        LocalDate d3 = LocalDate.parse("2019-12-02");

        //compare dates
        System.out.println(d1.isBefore(d2)); // -> true
        System.out.println(d1.isAfter(d2)); // -> false
        System.out.println(d2.equals(d3)); // -> true

        //work with dates
        System.out.println(d1.getDayOfWeek()); // -> SUNDAY
        System.out.println(d1.getMonth()); // -> DECEMBER
        System.out.println(d1.plus(1, ChronoUnit.YEARS));  // -> 2020-12-01

        // get today's date and print it in a specific format
        LocalDate d4 = LocalDate.now();
        System.out.println(d4); // -> 2019-10-15
        System.out.println(d4.format(DateTimeFormatter.ofPattern("MMM d yyyy"))); // -> Oct 15 2019

    }
}
