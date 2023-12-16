package by.academy.lesson10.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateDemo3 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		int year = today.get(ChronoField.YEAR);
		int month = today.get(ChronoField.MONTH_OF_YEAR);
		int dayYear = today.get(ChronoField.DAY_OF_YEAR);
		int dayMonth = today.get(ChronoField.DAY_OF_MONTH);
		int dayWeek = today.get(ChronoField.DAY_OF_WEEK);

		LocalDate dte = today.withYear(2000);
		System.out.println(dte.isLeapYear());
		System.out.println(dte);
		System.out.println("Год: " + year);
		System.out.println("Месяц: " + month);
		System.out.println("День в году: " + dayYear);
		System.out.println("День месяца: " + dayMonth);
		System.out.println("День недели: " + dayWeek);
	}
}