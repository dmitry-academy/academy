package by.academy.lesson5.a.b.c.d.e;


import by.academy.lesson1.Cat;

public class TestPackageDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		by.academy.lesson5.a.Cat cat1 = new by.academy.lesson5.a.Cat();
		test(cat);
		test(cat1);

		if (cat1 instanceof by.academy.lesson5.a.Cat) {
			System.out.println("alalal");
		}
	}

	public static void test(Cat cat) {
		System.out.println(cat);
	}

	public static void test(by.academy.lesson5.a.Cat cat) {
		System.out.println(cat);
	}
}
