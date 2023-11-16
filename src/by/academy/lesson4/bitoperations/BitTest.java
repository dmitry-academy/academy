package by.academy.lesson4.bitoperations;

public class BitTest {

	public static void main(String[] args) {
//		System.out.println(1 ^ 1);
//		System.out.println(199 ^ 199);

		int[] arr = { 1, 5, 6, 10, 12, 23, 5, 1, 6, 23 };

		int result = 0;
		for (int i : arr) {
			result ^= i;
		}
		System.out.println(result);
	}

}
