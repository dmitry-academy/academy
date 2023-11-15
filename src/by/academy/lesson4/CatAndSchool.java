package by.academy.lesson4;

import by.academy.lesson1.Cat;

public class CatAndSchool {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat_11_13", 0);

//        while (cat.getAge() < 7) {
//            cat.grow();
//        }

        do {
            cat.grow();
        } while (cat.getAge() < 7);
        System.out.println(cat.getNickname() + " пора идти в школу, ему " + cat.getAge() + " лет");
    }
}
