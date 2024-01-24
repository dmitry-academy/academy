package by.academy.lesson13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        List<Integer> ints = new ArrayList<>();
        ints.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
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
