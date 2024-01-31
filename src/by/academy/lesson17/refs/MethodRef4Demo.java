package by.academy.lesson17.refs;

import java.util.function.Function;

public class MethodRef4Demo {

	public static void main(String[] args) {
		Function<String, Integer> function = d -> new Integer(d);
		System.out.println(function.apply("4"));

		Function<String, Integer> function1 = Integer::new;
		System.out.println(function1.apply("4"));
	}
}
