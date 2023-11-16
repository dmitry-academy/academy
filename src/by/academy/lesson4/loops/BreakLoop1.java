package by.academy.lesson4.loops;

public class BreakLoop1 {
	public static void main(String[] args) {
		int i = 13;

		int result = 0;
		while (i <= 100) {
			if (i % 12 == 0) {
				result = i;
				System.out.println("STOP");
				break;
			}
			System.out.println("i: " + i++);
		}
		System.out.println("Цикл завершен. result: " + result);
	}
}