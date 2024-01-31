package by.academy.lesson17.refs;

import java.util.function.Consumer;

public class MethodRef2Demo {

	public static void main(String[] args) {
		Cat c = new Cat();

		System.out.println(c);
		Consumer<Double> s = d -> c.setWeight(d);
		s.accept(5.0);
		System.out.println(c);

		Consumer<Double> s1 = c::setWeight;
		s1.accept(4.0);
		System.out.println(c);

	}

	public static void test(Consumer<Double> s) {
		s.accept(4.0);
	}
}
