package by.academy.lesson13.classwork;

public class MinMax<T extends Comparable<T>> {

    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        T min = array[0];

        for (T num : array) {
            if (num == null) {
                continue;
            }

            if (num.compareTo(min) < 0) {
                min = num;
            }
        }

        return min;
    }

    public double max() {
        return 0;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 6, 7, 1, 3, 6, -1, -414, -1000};
        MinMax<Integer> minMax = new MinMax<>(array);

        System.out.println(minMax.min());
    }
}
