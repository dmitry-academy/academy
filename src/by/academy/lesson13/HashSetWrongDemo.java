package by.academy.lesson13;

import java.util.HashSet;

public class HashSetWrongDemo {

    public static void main(String[] args) {

        HashSet<BadCat> set = new HashSet<>();

        set.add(new BadCat("Cat1", 10));
        set.add(new BadCat("Cat1", 10));

        for (BadCat s : set) {
            System.out.println(s);
        }
    }
}
