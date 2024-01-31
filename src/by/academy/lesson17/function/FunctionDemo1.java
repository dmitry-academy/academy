package by.academy.lesson17.function;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {

        Function<Double, Integer> function = d -> d.intValue();

        System.out.println(function.apply(5.7));


        Function<Integer, String> f =
                d -> d > 0 ? "больше нуля" : d < 0 ? "меньше нуля" : "ноль";
        System.out.println(f.apply(1));

        Function<Integer, String> f1 = d -> {
            if (d > 0) {
                return "больше нуля";
            } else if (d < 0) {
                return "меньше нуля";
            } else {
                return "ноль";
            }
        };


    }
}