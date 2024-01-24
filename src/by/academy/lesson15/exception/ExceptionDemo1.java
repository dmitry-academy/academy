package by.academy.lesson15.exception;

public class ExceptionDemo1 {

    public static void main(String[] args) throws MyException {
        int d = 0;
        int a = 10 / d;
//		subRoutine();
    }

    public static void subRoutine() throws ArithmeticException {
        int d = 0;
        int a = 10 / d;
//		Double a = 1.0;
//		Double b = 0.0;
    }
}