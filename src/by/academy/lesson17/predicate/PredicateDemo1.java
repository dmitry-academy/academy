package by.academy.lesson17.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {

		Predicate<Integer> negative = i -> i < 0;
		Predicate<Integer> positive = i -> i > 0;

		System.out.println(negative.test(-6));
		System.out.println(negative.test(6));
		System.out.println(negative.test(0));
		System.out.println();
		System.out.println(positive.test(-6));
		System.out.println(positive.test(6));
		System.out.println(positive.test(0));


		System.out.println(test(1, positive));
		System.out.println(test(1, i -> i < 0));

	}

	
	public static boolean test(Integer i, Predicate<Integer> predicate) {
		return predicate.test(i);
	}
}