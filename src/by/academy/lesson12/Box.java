package by.academy.lesson12;

public class Box<T, V, K > {

    private T[] items;
    private V value;
    private K key;
    private int current = 0;

    public Box() {
        super();
        this.items = (T[]) new Object[10];
    }

    public Box(T[] items) {
        this.items = items;
    }

    public void add(T item) {
        if (items == null) {
            this.items = (T[]) new Object[10];
        }

        if (items.length <= current) {
            grow();
        }

        items[current++] = item;
    }

    private void grow() {
        T[] temp = (T[]) new Object[items.length * 2 + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
    }


    public void print() {
        for (int i = 0; i < current; i++) {
            System.out.println(items[i]);
        }
    }
}
