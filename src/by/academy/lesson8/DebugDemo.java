package by.academy.lesson8;

import by.academy.lesson8.deal.User;

import java.util.Scanner;

public class DebugDemo {
    public static void main(String[] args) {
        User u = new User();
        Integer i = 0;

        i++;
        i = 5 + ++i;
        i += 10;
        System.out.println(i);


        Scanner sc = new Scanner(System.in);
        alala:
        while (true) {
            String command = sc.next();
            switch (command.toLowerCase()) {
                case "start":
                    System.out.println("do something");
                    break;
                case "stop":
                    System.out.println("stop app");
                    break alala;
            }
        }
        sc.close();
    }
}
