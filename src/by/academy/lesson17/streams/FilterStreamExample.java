package by.academy.lesson17.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamExample {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 6, 2, 8, 3, 6, 0, 2, 4, 6);
		List<Integer> intList = list.stream().filter(x -> x > 5).sorted().collect(Collectors.toList());

		System.out.println(list);
		System.out.println(intList);
	}

}
