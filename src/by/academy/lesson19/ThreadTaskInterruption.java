package by.academy.lesson19;

import java.util.concurrent.TimeUnit;

public class ThreadTaskInterruption {

    public static void main(String[] args) throws InterruptedException {

        ThreadTask t1 = new ThreadTask("First");
        t1.start();

        TimeUnit.SECONDS.sleep(1);
        t1.stop();

    }
}
