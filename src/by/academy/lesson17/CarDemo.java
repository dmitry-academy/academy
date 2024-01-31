package by.academy.lesson17;

import java.io.IOException;

public class CarDemo {
	public String a = "1";

	public static int countCompactCars(Car[] cars) {
		int counter = 0;

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getType() == CarTypes.COMPACT) {
				counter++;
			}
		}
		return counter;
	}

	public static int countBigCars(Car[] cars) {
		int counter = 0;

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getType() == CarTypes.BIG) {
				counter++;
			}
		}
		return counter;
	}

//	@FunctionalInterface
	interface Searchable {
		boolean test(Car car);
	}
//	// 1. Создать птицу с именем
//	// 2. Создадим интерфейс Flyable с одним методом fly(Bird bird)
//	// 3. создайте лямбду Flyable
//	// 4. Вызовите метод лямбды fly и передайте туда вашу птицу
	@FunctionalInterface
	interface Printable {
		void print(String str);
	}

	public static int countCars(Car[] cars, Searchable searchable) {
		int counter = 0;

		for (int i = 0; i < cars.length; i++) {
			if (searchable.test(cars[i])) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) throws IOException {
		Car[] cars = { new Car(CarTypes.SPORT, 34000), new Car(CarTypes.SPORT, 44000), new Car(CarTypes.COMPACT, 14000),
				new Car(CarTypes.COMPACT, 10000) };

		Searchable s = new Searchable() {
			@Override
			public boolean test(Car car) {
				return car.getType() == CarTypes.SPORT;
			}
		};
		Searchable l = c -> c.getCost() < 20000;
		int number = countCars(cars, l);

		System.out.println(number);
//		Printable printable = str -> System.out.println(str);
		
		

		
//		printable.print("any string");
////		int compactCarNumber = countCompactCars(cars);
//		int compactCarNumber = countCars(cars, c -> c.getCost() < 15000);
//		System.out.println(compactCarNumber);
////		CarDemo carDemo = new CarDemo();
//
//		Searchable expensiveCarsSearch = new ExpensiveCarsSearch();
//		Searchable compactCarSearch = new CompactCarSearch();
//
//		System.out.println(carDemo.getCarsNumber(cars, expensiveCarsSearch));
//		System.out.println(carDemo.getCarsNumber(cars, compactCarSearch));
//		System.out.println(carDemo.getCarsNumber(cars, new Searchable() {
//			@Override
//			public boolean test(Car car) {
//				return car.getCost() < 15000;
//			}
//		}));
//
//		System.out.println(carDemo.getCarsNumber(cars, c -> {
//			return c.getCost() < 15000;
//		}));

	}

//	private int getCarsNumber(Car[] cars, Searchable search) {
//		int result = 0;
//		for (Car car : cars) {
//			if (search.test(car)) {
//				result++;
//			}
//		}
//		return result;
//	}

}
