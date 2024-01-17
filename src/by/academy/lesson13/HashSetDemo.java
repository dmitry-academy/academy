package by.academy.lesson13;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Minsk");
        set.add("Brest");
        set.add("Grodno");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("Minsk".hashCode());
        System.out.println("Brest".hashCode());
        System.out.println("Grodno".hashCode());
        System.out.println(set.hashCode());
    }
}
