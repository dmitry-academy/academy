package by.academy.lesson19;

public class RunnableTaskRunner {
    public static void main(String[] args) {

        Thread t1 = new Thread(new RunnableTask(), "First");
        Thread t2 = new Thread(new RunnableTask(), "Second");
        Thread t3 = new Thread(new RunnableTask(), "Third");
        Thread t4 = new Thread(() -> System.out.println("PRINT something"), "Third");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
