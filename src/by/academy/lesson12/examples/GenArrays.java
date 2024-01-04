package by.academy.lesson12.examples;

public class GenArrays {
	public static void main(String[] args) {
		// Нельзя создать массив специфичных для типа обобщенных ссылок.
//		GenericSub<Integer>[] gens = new GenericSub<>[10];

		GenericSub<?>[] gens = new GenericSub<?>[10];
		gens[0] = new GenericSub<Integer>(34);
		gens[1] = new GenericSub<Double>(34.0);

	}
}