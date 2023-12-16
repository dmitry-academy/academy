package by.academy.lesson10.iterfaces;

public class ValidatorDemo {
    public static void main(String[] args) {
        Validator v = new BelorussianPhoneValidator();
        System.out.println(v.validate("+375111111111"));
        System.out.println(v.validate("+37511111111"));
    }
}
