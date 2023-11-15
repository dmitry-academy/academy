package by.academy.lesson4;


//2. Составьте программу, которая вычисляет сумму чисел от 1 до n.
//        Значение n вводится с клавиатуры.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();

        int summ = 0;

        for (int i = 0; i < n; i++) {
            summ += i;
        }
        System.out.println(summ);
    }
}
