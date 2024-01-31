package by.academy.lesson17.classwork;

import by.academy.lesson9.HeavyBox;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class RefDemo {

    public static void main(String[] args) {
        System.out.println(Math.abs(-6.5));

        UnaryOperator<Double> absConsumer = d -> Math.abs(d);
        System.out.println(absConsumer.apply(-1000d));

        UnaryOperator<Double> absRefConsumer = Math::abs;
        System.out.println(absRefConsumer.apply(-1000d));

        HeavyBox hb = new HeavyBox(1, 2, 3, 4);
        Consumer<HeavyBox> heavyBoxConsumer = b -> {
            b.setWeight(1000);
        };
        heavyBoxConsumer.accept(hb);

        Consumer<HeavyBox> heavyBoxRefConsumer =  HeavyBox::test;
        System.out.println(hb);

        Function<String, String> function1 = String::toLowerCase;
        System.out.println(function1.apply("OCPJP 8"));

        Function<String, Integer> function = Integer::new;
        System.out.println(function.apply("4"));

        Function<Integer, List<String>> function2 = ArrayList::new;

    }
}
