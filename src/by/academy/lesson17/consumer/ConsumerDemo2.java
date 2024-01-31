package by.academy.lesson17.consumer;

import java.util.function.Consumer;

public class ConsumerDemo2 {

	public static void main(String[] args) {

		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
//		printUpperCase.accept("hello");

		Consumer<String> substringTwoChars = str -> System.out.println(str.substring(0, 2));
		printUpperCase.andThen(substringTwoChars).accept("Hello world");
	}
}