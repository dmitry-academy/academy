package by.academy.lesson19;

public class ThreadTask extends Thread {

    private int i = 10;

    public ThreadTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = new Thread(() ->
                System.out.println(Thread.currentThread().getPriority()));
        t.setPriority(1);
        t.start();
    }
}
