package by.academy.lesson10.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2022, 2, 1);
		LocalTime now = LocalTime.now();

		LocalDateTime ldt = LocalDateTime.of(today, now);
		System.out.println(ldt);
	}
}
