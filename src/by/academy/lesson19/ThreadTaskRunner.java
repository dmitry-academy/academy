package by.academy.lesson19;

public class ThreadTaskRunner {

    public static void main(String[] args) {

        ThreadTask t1 = new ThreadTask("First");
        ThreadTask t2 = new ThreadTask("Second");
        ThreadTask t3 = new ThreadTask("Third");

        t1.start();
        t2.start();
        t3.start();

    }
}
