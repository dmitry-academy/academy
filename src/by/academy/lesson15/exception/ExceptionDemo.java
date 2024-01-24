package by.academy.lesson15.exception;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            int a = 4;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
        }

    }
}
