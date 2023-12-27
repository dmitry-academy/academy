package by.academy.lesson10.date.formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatLocalDateTimeDemo2 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2020, 1, 1, 10, 0, 0);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM, dd, yyyy HH:mm:ss", Locale.US);
		System.out.println(dateTime);

		System.out.println(dateTime.format(formatter));
	}
}