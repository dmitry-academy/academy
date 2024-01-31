package by.academy.lesson17.function;

import java.util.function.Function;

public class FunctionDemo3 {
	public static void main(String[] args) {
		Function<String, String> f = Function.identity();
		System.out.println(f.apply("Some Value"));
	}
}