package by.academy.lesson12;

//	а) Создать обобщенный класс с тремя параметрами (T, V, K).
// Класс содержит три переменные типа (T, V, K), конструктор,
// принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных.
// Создать метод, выводящий на консоль имена классов для трех переменных класса.
//  б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы-оболочки, String),
//  V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.

import by.academy.lesson8.deal.Product;

import java.io.Serializable;

public class ThreeGen<T extends Comparable<String>, V extends Product & Serializable, K extends Number> {

    private T t;
    private V v;
    private K k;

    public ThreeGen(T t, V v, K k) {
        super();
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printAll() {
        System.out.println(t.getClass().toString() + " " + v.getClass().toString() + " " + k.getClass().toString());
    }

    public void printT() {
        System.out.println(t.getClass().toString());
    }

    public void printV() {
        System.out.println(v.getClass().toString());
    }

    public void printK() {
        System.out.println(k.getClass().toString());
    }
}
