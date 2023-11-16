package by.academy.lesson4.arrays;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int[] monthDays = new int[12];

		System.out.println(monthDays);
		System.out.println(Arrays.toString(monthDays));

		monthDays[0] = 31;
		System.out.println(Arrays.toString(monthDays));

		monthDays[1] = 28;
		monthDays[2] = 31;
		monthDays[3] = 30;
		monthDays[4] = 31;
		monthDays[5] = 30;
		monthDays[6] = 31;
		monthDays[7] = 31;
		monthDays[8] = 30;
		monthDays[9] = 31;
		monthDays[10] = 30;
		monthDays[11] = 31;
		System.out.println(Arrays.toString(monthDays));

		System.out.println("B апреле " + monthDays[3] + " дней.");
	}
}