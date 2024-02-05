package by.academy.lesson18.classwork;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;


public class ProducerAnnotationDemo {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Class<Wine> clazz = Wine.class;

        Method m = clazz.getDeclaredMethod("getDiscount");
        Producer annotation = m.getAnnotation(Producer.class);

        System.out.println(annotation.country());
        System.out.println(annotation.founderFullName());
        System.out.println(annotation.startYear());

        Annotation[] annotations = m.getAnnotations();
        System.out.println(Arrays.toString(annotations));
    }

}
