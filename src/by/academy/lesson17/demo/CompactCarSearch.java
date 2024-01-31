package by.academy.lesson17.demo;

public class CompactCarSearch implements Searchable {

	@Override
	public boolean test(Car car) {
		return car.getType().equals(CarTypes.COMPACT);
	}

}