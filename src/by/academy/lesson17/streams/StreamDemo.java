package by.academy.lesson17.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String... args) {

		long count = Stream
							.generate(() -> new Random().nextInt(255))
							.limit(100)
							.filter(intValue -> intValue < 50)
							.peek(s -> System.out.print(s + " "))
							.map(intValue -> intValue.intValue())
							.peek(s -> System.out.print(s*1000 + " "))
							.count();

		System.out.println();
		System.out.println(count);
	}
}
