package by.academy.lesson17.refs;

import java.util.function.Function;

public class MethodRef1 {

	public static void main(String[] args) {

		Function<String, Boolean> function1 = e -> Boolean.valueOf(e);
		System.out.println(function1.apply("TRUE"));

		Function<String, Boolean> function2 = Boolean::valueOf;
		System.out.println(function2.apply("TRUE"));

		Function<String, String> function3 = s -> s.toLowerCase();
		System.out.println(function3.apply("OCPJP 8"));

		Function<String, String> function4 = String::toLowerCase;
		System.out.println(function4.apply("OCPJP 8"));
	}

}
