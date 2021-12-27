package com.whyelab;

import java.time.*;
import java.time.format.*;
public class FormattingDateAndTime {
    public static void main (String args[]) {
        // Create a local date time object:
        LocalDateTime today=LocalDateTime.now();
        DateTimeFormatter formatToday=DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss");
        //String formattedToday=today.format(formatToday);
        System.out.format("Formatted date time is %s\n", today.format(formatToday));

        // Create a local time object:
        LocalTime timeNow=LocalTime.now();
        DateTimeFormatter formatTimeNow=DateTimeFormatter.ofPattern("HH:mm:ss a");
        System.out.format("Formatted current time is %s\n", timeNow.format(formatTimeNow));

        // Create a local date object:
        LocalDate dateToday=LocalDate.now();
        DateTimeFormatter formatDateToday=DateTimeFormatter.ofPattern("EEEE MMM dd ");
        System.out.format("Formatted current date is %s\n" , dateToday.format(formatDateToday));
    }
}
