package by.academy.lesson17.classwork;

import by.academy.lesson9.HeavyBox;

import java.util.function.Consumer;


//“Отгрузили ящик с весом n”.
// “Отправляем ящик с весом n”
public class ConsumerTask {
    public static void main(String[] args) {
        Consumer<HeavyBox> c1 = b -> System.out.println("Отгрузили ящик с весом " + b.getWeight());
        Consumer<HeavyBox> c2 = b -> System.out.println("Отправляем ящик с весом " + b.getWeight());

        c1.andThen(c2).accept(new HeavyBox(1, 2, 3, 4));
    }
}
