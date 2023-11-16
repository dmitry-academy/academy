package by.academy.lesson3.scanner;

import java.util.Scanner;

public class ScannerDemo6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer i = scan.nextInt();
//		scan.nextLine();
//		String str = scan.nextLine();
		String str = scan.next();
		System.out.println("i = " + i);
		System.out.println("str = " + str);

		scan.close();
	}
}
