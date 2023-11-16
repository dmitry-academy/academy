package by.academy.lesson2.scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите ваше имя: ");
		String name = in.nextLine();
		System.out.println("Имя: " + name);
		in.close();
	}
}