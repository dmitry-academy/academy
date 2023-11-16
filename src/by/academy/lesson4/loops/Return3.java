package by.academy.lesson4.loops;

public class Return3 {

	public static void main(String... args) {
		printFirstFiveElements(5);
		System.out.println("Hello from main!");
	}

	static void printFirstFiveElements(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			if (i >= 5) {
				return;
			}
		}
		System.out.println("ALALALA");
	}

}
