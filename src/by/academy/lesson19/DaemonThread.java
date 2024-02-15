package by.academy.lesson19;

import java.util.concurrent.TimeUnit;

public class DaemonThread {

    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(getRunnableTask());
        t.setDaemon(true);
        t.start();
//        Thread.currentThread().join();
        System.out.println("Main thread finished.");
    }

    private static Runnable getRunnableTask() {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                for (int j = 0; j < 10000; j++) {
                    i++;
                }
                System.out.println("Additional thread finished: " + i);
            }
        };
    }
}
