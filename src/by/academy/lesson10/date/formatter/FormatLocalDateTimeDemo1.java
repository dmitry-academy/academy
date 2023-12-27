package by.academy.lesson10.date.formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class FormatLocalDateTimeDemo1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("June 05, 2018 12:10:56", formatter1);
        System.out.println(localDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate localDate = LocalDate.parse("June 5, 2018", formatter2);
        System.out.println(localDate);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate3 = LocalDate.parse("01-01-2023", formatter3);
        System.out.println(localDate3);

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate4 = LocalDate.parse("20/12/2023", formatter4);
        System.out.println(localDate4);
    }
}