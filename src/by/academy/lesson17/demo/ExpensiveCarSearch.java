package by.academy.lesson17.demo;

public class ExpensiveCarSearch implements Searchable {

	public boolean test(Car car) {
		return car.getCost() > 20000;
	}
}
