package by.academy.lesson17.refs;

import java.util.function.Function;

public class MethodRef3Demo {

	public static void main(String[] args) {
		Function<String, String> function = s -> s.toLowerCase();
		System.out.println(function.apply("OCPJP 8"));

		Function<String, String> function2 = String::toLowerCase;
		System.out.println(function2.apply("OCPJP 8"));

		Function<Cat, Double> catFunction = Cat::getWeight;
		
		Cat cat = new Cat();

		cat.setWeight(10000);

		System.out.println(catFunction.apply(cat));

	}

}
