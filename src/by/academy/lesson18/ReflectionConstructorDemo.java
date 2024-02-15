package by.academy.lesson18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectionConstructorDemo {

    public static void main(String[] args) {
        try {

            Class<Car> carClass = Car.class;
            Constructor<Car> c = carClass.getConstructor();

            Car car1 = c.newInstance();
            System.out.println(car1);

//            Modifier.isFinal(0);
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
                 | IllegalArgumentException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
