package by.academy.lesson14.comparator;

import java.util.TreeSet;

public class ComparePersonDemo {
	public static void main(String[] args) {

		TreeSet<Person> set = new TreeSet<>();

		set.add(new Person("Саша", "Иванов", 36));
		set.add(new Person("Маша", "Петрова", 23));
		set.add(new Person("Даша", "Сидорова", 34));
		set.add(new Person("Вася", "Иванов", 25));

		for (Person p : set) {
			System.out.println(p);
		}
	}
}