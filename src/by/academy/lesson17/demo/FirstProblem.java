package by.academy.lesson17.demo;

public class FirstProblem {

	public static void main(String... args) {
		Car[] cars = { new Car(CarTypes.COMPACT, 34000), new Car(CarTypes.SPORT, 44000),
				new Car(CarTypes.COMPACT, 14000), new Car(CarTypes.COMPACT, 10000), new Car(CarTypes.BIG, 24000) };
//		System.out.println(getExpensiveCarsNumber(cars));
//		System.out.println(getCompactCarsNumber(cars));
//		System.out.println(getCarsNumber(cars, new CompactCarSearch()));
//		System.out.println(getCarsNumber(cars, new Searchable() {
//			@Override
//			public boolean test(Car car) {
//				return car.getCost() < 14000;
//			}
//		}));
//		boolean test(Car car);
		
		Searchable s = car -> car.getCost() < 14000;
		
		System.out.println(getCarsNumber(cars, s));

	}

	private static int getCarsNumber(Car[] cars, Searchable s) {
		int result = 0;
		for (Car car : cars) {
			if (s.test(car)) {
				result++;
			}
		}
		return result;
	}

	private static int getExpensiveCarsNumber(Car[] cars) {
		int result = 0;
		for (Car car : cars) {
			if (car.getCost() > 20000) {
				result++;
			}
		}
		return result;
	}

	private static int getCompactCarsNumber(Car[] cars) {
		int result = 0;
		for (Car car : cars) {
			if (car.getType().equals(CarTypes.COMPACT)) {
				result++;
			}
		}
		return result;
	}
}
