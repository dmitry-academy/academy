package by.academy.lesson2.operators;

public class ComparisonOperators {

	public static void main(String[] args) {
		boolean b1 = 5 == 10;
		System.out.println(b1);

		boolean b2 = 5 != 10;
		System.out.println(b2);

		boolean b3 = 5 < 10;
		System.out.println(b3);

		boolean b4 = 5 > 10;
		System.out.println(b4);

		int x = 10;
		// 5 < x < 10
		boolean b5 = 5 < x && x < 10;
		System.out.println(b5);

		boolean b6 = 5 < x & x < 10;
		System.out.println(b5);

		boolean b7 = existByLastName("Jack") & existByFirstName("Bob");
		System.out.println(b7);
	}

	public static boolean existByLastName(String name) {
		System.out.println("existByLastName");
		return false;
	}

	public static boolean existByFirstName(String name) {
		System.out.println("existByFirstName");
		return true;
	}

}
