package by.academy.lesson10.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo2 {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
//		LocalDate today = LocalDate.of(2022, 2, 1);
		System.out.println(today);

		int year = today.getYear();
		int month = today.getMonthValue();
		Month monthAsEnum = today.getMonth(); // как перечисление

		int dayYear = today.getDayOfYear();
		int dayMonth = today.getDayOfMonth();
		DayOfWeek dayWeekEnum = today.getDayOfWeek(); // как перечисление

		System.out.println("Год: " + year);
		System.out.println("Месяц: " + month);
		System.out.println("Название месяца: " + monthAsEnum);
		System.out.println("День в году: " + dayYear);
		System.out.println("День месяца: " + dayMonth);
		System.out.println("День недели: " + dayWeekEnum);
		System.out.println("День недели(number): " + dayWeekEnum.getValue());

	}
}