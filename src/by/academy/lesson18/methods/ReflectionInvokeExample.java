package by.academy.lesson18.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import by.academy.lesson18.Car;

public class ReflectionInvokeExample {
	public static void main(String... args) {

		Car car = new Car(100, "AA180A1");
		Class<? extends Car> carClass = car.getClass();

		Method getHorsepowerMethod;
		try {
			getHorsepowerMethod = carClass.getMethod("getHorsepower");
			int resultValue = (int )getHorsepowerMethod.invoke(car);

			System.out.println(resultValue);
			Method setHorsepowerMethod =
					carClass.getDeclaredMethod("setHorsepower", int.class);
			setHorsepowerMethod.setAccessible(true);
			System.out.println("Before change: " + car.getHorsepower());
			setHorsepowerMethod.invoke(car, 350);
			System.out.println("After change: " + car.getHorsepower());

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
