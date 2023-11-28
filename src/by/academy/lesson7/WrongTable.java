package by.academy.lesson7;

import java.util.Scanner;

public class WrongTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(i * n);
        }

        sc.close();
    }
}
