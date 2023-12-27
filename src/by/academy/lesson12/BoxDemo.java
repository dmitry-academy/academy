package by.academy.lesson12;

import by.academy.lesson1.Cat;
import by.academy.lesson8.deal.Product;

public class BoxDemo {
    public static void main(String[] args) {

        Box<Cat> catBox1 = new Box<>();
        catBox1.add(new Cat("Кот 1"));
        catBox1.add(new Cat("Кот 2"));
        catBox1.add(new Cat("Кот 3"));
        catBox1.add(new Cat("Кот 4"));
        catBox1.print();

        Box<Product> productBox1 = new Box<>();
        productBox1.add(new Product());
        productBox1.add(new Product());
        productBox1.add(new Product());
        productBox1.add(new Product());
        productBox1.print();

    }
}
