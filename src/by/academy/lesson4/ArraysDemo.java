package by.academy.lesson4;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] ints = new int[10];

        System.out.println(ints);

        ints[4] = 100;
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println(Arrays.toString(ints));

        System.out.println("-----------");
        int[][] ints1 = {{1, 3}, {5, 7}, {7, 4}};
        System.out.println(Arrays.deepToString(ints1));

        int[] ints2 = {1, 3, 7, 3, 2, 5, 75, 68, 3, 2341, 234, 356, 568, 54, 32, 5};
        System.out.println(Arrays.toString(ints2));
        Arrays.sort(ints2);
        System.out.println(Arrays.toString(ints2));

    }
}
