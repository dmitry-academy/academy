package by.academy.lesson18.classwork;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TigerDemoInvoke {
    public static void main(String[] args)
            throws NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException {


        Tiger tiger = new Tiger();
        Class<Tiger> clazz = Tiger.class;

        Method methodSleep = clazz.getDeclaredMethod("sleep");
        methodSleep.setAccessible(true);

        methodSleep.invoke(tiger);
    }
}
