package by.academy.lesson2.example;

// Класс DogService имеет точку входа в ваше приложение,
// а именно метод main
public class DogService {
    public static void main(String[] args) {
        // в этом классе мы можем создавать экземпляры класса, вызывать методы и менять параметры объекта

        // создание объекта класса Dog, использую конструктор по умолчанию
        Dog pluto = new Dog();
        pluto.setNickname("Pluto");
        pluto.setColor("белый");
        System.out.println(pluto);

        // создание объекта класса Dog, использую конструктор с 1м параметром nickname
        Dog jack = new Dog("Jack");
        System.out.println(jack);

        // создание объекта класса Dog, использую конструктор с 3мя параметрами
        Dog bobik = new Dog("Bobik", 5, "Red");
        System.out.println(bobik);

        bobik.eat();
        bobik.sleep();
        bobik.serve();
    }
}
