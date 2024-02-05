package by.academy.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.GregorianCalendar;

public class ReflectionFieldDemo {

    public static void main(String... args) {

//		GregorianCalendar calendar = new GregorianCalendar();
//		Class<GregorianCalendar> calendarClass = GregorianCalendar.class;
//		System.out.println(GregorianCalendar.BC);
//
//		try {
//			Field bcField = calendarClass.getDeclaredField("BC");
//			bcField.setAccessible(true);
//
//			Field modifiersField = bcField.getClass().getDeclaredField("modifiers");
//			modifiersField.setAccessible(true);
//			modifiersField.setInt(bcField, bcField.getModifiers() & ~Modifier.FINAL);
//			int modifiers = bcField.getModifiers();
//			bcField.set(calendar, 9999); // output: 1233
//			System.out.println(GregorianCalendar.BC);
//			System.out.println("Is private: " + Modifier.isPrivate(modifiers));
//		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException  e) {
//			e.printStackTrace();
//		}
        Car car = new Car(500, "1233");
        Car car1 = new Car(100, "555");
        Vehicle vehicle = new Vehicle();
        Class<Car> carClass = Car.class;

        // Example 1
        try {
            Field serialNumberField = carClass.getDeclaredField("serialNumber");
            serialNumberField.setAccessible(true);
            System.out.println(serialNumberField.get(car)); // output: 1233
            System.out.println(serialNumberField.get(car1)); // output: 555
//			System.out.println(serialNumberField.get(cat)); // exception

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
//
        // Example 2
		try {
			Field horsepowerField = carClass.getDeclaredField("horsepower");
			horsepowerField.setAccessible(true);
			int horsepowerValue = horsepowerField.getInt(car);
			System.out.println(horsepowerValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

//		 Example 3
		try {
			Field horsepowerField = carClass.getDeclaredField("horsepower");

			String name = horsepowerField.getName();
			System.out.println(name);

			Class<?> type = horsepowerField.getType();
			System.out.println(type);

			int modifiers = horsepowerField.getModifiers();
			System.out.println(modifiers); // output: 2

			System.out.println("isPrivate: " + Modifier.isPrivate(modifiers)); // output: true
			System.out.println("isFinal: " + Modifier.isFinal(modifiers)); // output: false
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}
    }
}
