package by.academy.lesson4;

public class Task1 {
    public static void main(String[] args) {
//        Задача: Найти последнее число из отрезка [15,50], которое нацело делится на 13;
        int i = 50;
        while (i >= 15) {
            if (i % 13 == 0) {
                break;
            }
            i--;
        }
        System.out.println(i);
    }
}
