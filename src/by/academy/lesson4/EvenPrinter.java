package by.academy.lesson4;

public class EvenPrinter {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Пропускаем: " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
