package by.academy.lesson4;

public class InnerFor {
    public static void main(String[] args) {


        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i * j);
                if (j == 5) {
                    continue outer;
                }
            }
        }


        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println("alalal");
        }
    }
}
