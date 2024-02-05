package by.academy.homework;

import java.util.Iterator;

public class Iterator2DArrayDemo {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        Iterator<Integer> iterator = new Iterator2DArray(array);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
