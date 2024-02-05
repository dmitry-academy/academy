package by.academy.lesson18;

import java.lang.reflect.InvocationTargetException;


public class ReflectionDemo {

	public static void main(String[] args) {
		// example 1
		try {
			Class<?> carClass1 = Class.forName("by.academy.lesson18.Car");
			System.out.println(carClass1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// example 2
		Car car = new Car();
//		car.setHorsepower(100);
		Class<? extends Car> carClass2 = car.getClass();
		System.out.println(carClass2);

//		Animal cat = new Cat();
//		car.setHorsepower(100);
//		Class<? extends Animal> catClass2 = cat.getClass();

//		System.out.println(catClass2);

		// example 3
		Class<Car> carClass3 = Car.class;
		System.out.println(carClass3);

		Package p = carClass3.getPackage();
		System.out.println("package " + p.getName() + ";");

		try {
			Car obj = (Car) carClass2.getDeclaredConstructor().newInstance();
			System.out.println(obj);
//			Class.forName("by.academy.reflection.Car").getDeclaredConstructor().newInstance();

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
