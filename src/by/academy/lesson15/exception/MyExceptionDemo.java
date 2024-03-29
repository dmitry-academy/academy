package by.academy.lesson15.exception;

public class MyExceptionDemo {
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехваченное исключение." + e);
        }
    }

    public static void compute(int a) throws MyException {

        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10) {
            try {
                test();
            } catch (RuntimeException e) {
                throw new MyException(e);
            }
        }
        System.out.println("Нормальное завершение.");
    }

    public static void test() {
        throw new NullPointerException("alalal");
    }
}