package by.academy.lesson17.classwork;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable p1 = s -> System.out.println("Привет! ваша строка: " + s);
        Printable p2 = s -> System.out.println("алалала: " + s);
        Printable p3 = s -> System.out.println("олололо: " + s);
        Printable p4 = s -> System.out.println("Я последняя лямбда со строкой: " + s);

        p1.print("Тест1");
        p2.print("Тест2");
        p3.print("Тест3");
        p4.print("Тест4");
    }
}
