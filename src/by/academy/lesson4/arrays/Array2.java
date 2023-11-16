package by.academy.lesson4.arrays;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println(Arrays.toString(monthDays));

		System.out.println("B апреле " + monthDays[3] + " дней.");
	}
}