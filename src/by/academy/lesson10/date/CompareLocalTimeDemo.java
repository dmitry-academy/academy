package by.academy.lesson10.date;

import java.time.LocalTime;

public class CompareLocalTimeDemo {
	public static void main(String[] args) {
		LocalTime fiveThirty = LocalTime.of(5, 30);
		LocalTime noon = LocalTime.of(12, 0, 0);
		LocalTime almostMidnight = LocalTime.of(23, 59, 59);
		LocalTime almostMidnight1 = LocalTime.of(23, 59, 59, 000);

		System.out.println("fiveThirty.isAfter(noon)? " + fiveThirty.isAfter(noon)); // false
		System.out.println("fiveThirty.isBefore(noon)? " + fiveThirty.isBefore(noon)); // true
		System.out.println("noon.equals(almostMidnight)? " + noon.equals(almostMidnight)); // false
	}
}