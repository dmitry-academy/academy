package by.academy.lesson14;

import by.academy.lesson8.deal.Product;

import java.util.HashMap;
import java.util.Map;

public class MapProduct {

    public static void main(String[] args) {
        Map<String, Product> products = new HashMap<>();

        products.put("Молоко", new Product());
        products.put("Батон", new Product());
        products.put("Торт", new Product());
        products.put("Мясо", new Product());

        for (String key : products.keySet()) {
            System.out.println(key);
        }

        for (Product value : products.values()) {
            System.out.println(value);
        }


    }
}
