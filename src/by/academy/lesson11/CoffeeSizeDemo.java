package by.academy.lesson11;

import java.util.Arrays;

public class CoffeeSizeDemo {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;

        String string = "HUGE";
        CoffeeSize coffeeSize1 = CoffeeSize.valueOf(string);

        System.out.println(coffeeSize1);

        System.out.println(coffeeSize1.name());
        System.out.println(coffeeSize1.ordinal());

        coffeeSize.buy();
        coffeeSize1.buy();


        switch (coffeeSize) {
            case BIG:
                System.out.println("Coffee size BIG");
                break;
            case HUGE:
                System.out.println("Coffee size HUGE");
                break;
            case OVERWHELMING:
                System.out.println("Coffee size OVERWHELMING");
                break;
            default:
                System.out.println("Coffee size not recogized");
        }
        System.out.println(Arrays.toString(CoffeeSize.values()));

        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size);
        }
    }
}
