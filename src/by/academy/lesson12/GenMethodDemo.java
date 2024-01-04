package by.academy.lesson12;

import by.academy.lesson9.overrides.N;

public class GenMethodDemo {

	/**
	 * Является ли объект x элементом массива array
	 *
	 * @param x
	 * @param array
	 * @param <T>
	 * @param <V>
	 * @return
	 */
	public static <N, X> boolean isIn(N n, X[] array) {
		for (X element : array) {
			if (n.equals(element)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };

		if (isIn(new Object(), intArray)) {
			System.out.println("2 входит в массив intArray");
		}

		if (!isIn(7, intArray)) {
			System.out.println("7 не входит в intArray");
		}
		System.out.println();

		String[] strArray = { "one", "two", "three", "four", "five" };

		if (isIn("five", strArray)) {
			System.out.println("five in array");
		}

//		if (!isIn("seven", strArray)) {
//			System.out.println("seven не входит в массив strArray");
//		}
	}
}