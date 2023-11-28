package by.academy.lesson6;

public class BlankDemo {
    public static void main(String[] args) {
        String string = "";
        boolean isEmpty = string.isEmpty();
        boolean isBlank = string.isBlank();

        System.out.println("isEmpty: " + isEmpty);
        System.out.println("isBlank: " + isBlank);
    }
}
