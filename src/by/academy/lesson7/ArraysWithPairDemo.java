package by.academy.lesson7;

public class ArraysWithPairDemo {

    public static void main(String[] args) {
        char[] array = {'1', '4', '5', '2', '3', '1', '5', '4', '2'};

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }

        System.out.println((char) result);

        System.out.println(1 ^ 1);
        System.out.println(2 ^ 2);
        System.out.println(3 ^ 3);
        System.out.println(4 ^ 4);
        System.out.println(5 ^ 5);
        System.out.println(0 ^ 19);
    }
}
