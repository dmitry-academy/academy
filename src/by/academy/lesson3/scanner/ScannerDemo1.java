package by.academy.lesson3.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.print("Введите строку: ");
//		String str = scanner.nextLine();
		System.out.print("Введите целое число: ");

		if (scanner.hasNextInt()) {
			int i = scanner.nextInt();
			System.out.println(i);
		} else {
			System.out.println("Вы ввели не целое число");
		}
//		System.out.print("Ваша строка: " + str);

		scanner.close();
	}
}