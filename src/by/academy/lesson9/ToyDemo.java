package by.academy.lesson9;

public class ToyDemo {
	public static void main(String... args) {

		Toy t1 = new Toy();
		System.out.println(t1);

		Toy t2 = new Toy(20, 100.0);
		System.out.println(t2);

		String[] arr = { "Disney" };
		Toy toy = new Toy("Кукла", 34, arr, 3);
		System.out.println(toy);

	}
}