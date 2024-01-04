package by.academy.lesson12;

public class Calculator {

    public static <X extends Number, Y extends Number> double sum(X x, Y y) {
        return x.doubleValue() + y.doubleValue();
    }


    public static void main(String[] args) {
        double result = Calculator.sum(1, 123123l);
        System.out.println(result);
    }
}
