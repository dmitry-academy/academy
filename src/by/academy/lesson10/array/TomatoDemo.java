package by.academy.lesson10.array;

public class TomatoDemo {
    public static void main(String[] args) {
        Container c = new Container();

        c.add(new Tomato("Бычье сердце", 3));
        c.add(new Tomato("Пальчики", 3));
        c.add(new Tomato("Черри", 3));
        c.add(new Tomato("Вася", 3));
        c.add(new Tomato("РБ", 3));

        c.printTomatos();
        System.out.println();
        c.delete(0);
        c.printTomatos();

    }
}
