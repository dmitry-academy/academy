package by.academy.lesson14;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionIntersectDemo {

    public static void main(String[] args) {

        List<String> list1 = List.of("a", "b", "c", "d");
        List<String> list2 = List.of("d", "e", "f", "c");

        System.out.println("Union: ");
        Set<String> union = union(list1, list2);
        System.out.println("                       " + union);

        System.out.println("Intersect: ");
        Set<String> intersect = intersect(list1, list2);
        System.out.println("                       " + intersect);
    }

    public static <T> Set<T> intersect(Collection<T>... sets) {

        if (sets != null && sets.length > 0) {
            Set<T> intersect = new HashSet<>(sets[0]);

            for (int i = 1; i < sets.length; i++) {
                intersect.retainAll(sets[i]);
            }
            return intersect;
        }
        return null;
    }

    public static <T> Set<T> union(Collection<T>... sets) {
        Set<T> union = new HashSet<>();
        for (Collection<T> s : sets) {
            union.addAll(s);
        }
        return union;
    }
}
