package by.academy.lesson2.scanner;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String args[]) {
		
		String s = "Hello World.";
		// Создание Scanner объекта и передача строки в конструктор
		Scanner scan = new Scanner(s);
		// Проверить, есть ли в Scanner объект, с котороым он может работать
		System.out.println("Boolean переменная: " + scan.hasNext());
		// Распечатать строку
		System.out.println("Строка: " + scan.nextLine());
		scan.close();
		
		System.out.println("--------Введите ваши данные-------- ");
		Scanner in = new Scanner(System.in);
		System.out.print("Введите имя: ");
		String name = in.next();
		System.out.println("Имя: " + name);
		System.out.print("Введите возраст: ");
		int i = in.nextInt();
		System.out.println("Возраст: " + i);
		System.out.print("Введите ваш рост: ");
		double d = in.nextDouble();
		System.out.println("Рост: " + d);
		in.close();
	}
}