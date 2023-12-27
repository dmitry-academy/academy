package by.academy.lesson12;

import by.academy.lesson8.deal.Product;

public class ThreeGenDemo {
    public static void main(String[] args) {

        ThreeGen<String, Product, Integer> threeGen = new ThreeGen<>("alalal", new Product(), 10);
        threeGen.printAll();
        threeGen.printT();

        System.out.println(threeGen.getT());
    }
}
