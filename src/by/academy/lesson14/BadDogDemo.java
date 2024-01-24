package by.academy.lesson14;

import java.util.HashMap;

public class BadDogDemo {
    public static void main(String[] args) {
        HashMap<BadDog, String> badDogMap = new HashMap<>();

        BadDog test = new BadDog("Рэкс");

        BadDog db1 = new BadDog("Рэкс");
        BadDog db2 = new BadDog("Шарик");
        BadDog db3 = new BadDog("Тузик");
        BadDog db4 = new BadDog("Палкан");

        badDogMap.put(db1, "Собака Рэкс");
        badDogMap.put(db2, "Собака Шарик");
        badDogMap.put(db3, "Собака Тузик");
        badDogMap.put(db4, "Собака Палкан");

        db1.setNickname("Вася");

        System.out.println(badDogMap.get(db1));
        System.out.println();
    }
}
