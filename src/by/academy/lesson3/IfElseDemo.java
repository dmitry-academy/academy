package by.academy.lesson3;

public class IfElseDemo {
    public static void main(String[] args) {


        int deg = 100;
//        if (deg > 35) {
//            System.out.println("Нужно включить кондиционер и выпить пива");
//        }
//        if (deg > 25) {
//            System.out.println("Одеться и работать");
//        }
//        if (deg > 15) {
//            System.out.println("В баню");
//        }
//        if (deg > 0) {
//            System.out.println("Пора менять резину");
//        }
//        if (deg > -15) {
//            System.out.println("Достаем санки");
//        }

        if (deg > 35) {
            System.out.println("Нужно включить кондиционер и выпить пива");
            if (deg > 35) {
                System.out.println("Нужно включить кондиционер и выпить пива");
                if (deg > 35) {
                    System.out.println("Нужно включить кондиционер и выпить пива");
                    if (deg > 35) {
                        System.out.println("Нужно включить кондиционер и выпить пива");
                    }
                }
            }
        } else if (deg > 25) {
            System.out.println("Одеться и работать");
        } else if (deg > 15) {
            System.out.println("В баню");
        } else if (deg > 0) {
            System.out.println("Пора менять резину");
        } else if (deg > -15) {
            System.out.println("Достаем санки");
        } else {
            System.out.println("Сидим дома");
        }
//
//        if (deg > 35) {
//            System.out.println("alala");
//        }
        boolean isWinter = true;

//        if (isWinter) {
//            System.out.println("Нужно одеть шапку");
//        } else {
//            System.out.println("Можно ходить без шапки");
//        }
        String result =
                isWinter ? "Нужно одеть шапку"
                        : "Можно ходить без шапки";

        System.out.println(isWinter ? "Нужно одеть шапку" : "Можно ходить без шапки");
    }
}
