package by.academy.homework;

import java.util.Iterator;

/**
 * Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
 * Протестировать в main.
 */
public class Iterator2DArray implements Iterator<Integer> {

    private int[][] array;
    private int i = 0;
    private int j = 0;


    public Iterator2DArray(int[][] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        return i < array.length && j < array[i].length;
    }

    //    [1][4][5][1][2]
    //    [4][8][6][4][2]
    //    [8][2][4][4][4]
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException();
        }
        int value = array[i][j];
        if (j < array[i].length - 1) {
            j++;
        } else if (j == array[i].length - 1) {
            j = 0;
            i++;
        }
        return value;
    }
}
