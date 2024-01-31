package by.academy.lesson17.refs;

import java.util.function.Consumer;

public class MethodRefDemo {

	public static void main(String[] args) {
		Consumer<String> printer = str -> System.out.println(str);
		printer.accept("Hello there!");

		Consumer<String> printerRef = System.out::println;
		printerRef.accept("Hello from another there!");

	}

}
