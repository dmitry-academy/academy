package by.academy.lesson17.streams;

import java.util.Random;
import java.util.stream.Stream;

public class PeekDemo {

	public static void main(String[] args) {

		Stream<Integer> ints = Stream.generate(() -> new Random().nextInt(255)).limit(10)
				.peek(s -> System.out.print(s + " "));
		System.out.println("Hello there");

		long count = ints.count();
		System.out.println();
		System.out.println(count);
	}

}
