package by.academy.lesson4;

// Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
public class Task6 {
    public static void main(String[] args) {
        char c = 'h';

        for (int i = 0; i < 5; i++) {
            System.out.print(c++);
        }
    }
}
