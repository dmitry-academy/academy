package by.academy.lesson3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double d1 = sc.nextDouble();

        System.out.println("Введите второе число:");
        double d2 = sc.nextDouble();

        System.out.println("Введите знак:");
        String operator = sc.next();

        if ("-".equals(operator)) {
            System.out.println("Разница чисел равна: " + (d1 - d2));
        } else if ("+".equals(operator)) {
            System.out.println("Сумма чисел равна: " + (d1 + d2));
        } else if ("/".equals(operator)) {
            System.out.println("Деление чисел равно: " + (d1 / d2));
        } else if ("*".equals(operator)) {
            System.out.println("Умножение чисел равно: " + (d1 * d2));
        } else {
            System.out.println("Введите корректную операцию (+ - * /)");
        }

        sc.close();
    }
}
