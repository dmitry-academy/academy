package by.academy.lesson4;

public class ReturnDemo {
    public static void main(String[] args) {

        printFirstFiveElements(4);
        System.out.println("alalal");
    }

    public static void printFirstFiveElements(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
            if (i == 5) return;
        }
        System.out.println("printFirstFiveElements ended");
    }

}
