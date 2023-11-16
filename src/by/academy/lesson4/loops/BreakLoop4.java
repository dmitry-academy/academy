package by.academy.lesson4.loops;

public class BreakLoop4 {
	public static void main(String[] args) {
// Создать программу с двумя вложеными циклами, внешний от нуля до 10, внутренний от 0 до 50, как только i * j == 56
// выведем на экран i и j 
		int iResult = 0;
		int jResult = 0;

		outer: for (int i = 0; i < 3; i++) {
			System.out.print("Пpoxoд " + i + " : ");
			for (int j = 0; j < 100; j++) {
				if (j == 10) {
					break outer; // выход из обоих циклов
				}
				System.out.print(j + " ");
			}
			System.out.println("Этa строка не будет выводиться");
		}
		System.out.println("End");

	}
}