package by.academy.lesson19;

public class ThreadDemo {
    private static int i = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(getRunnableTask());
        Thread t2 = new Thread(getRunnableTask());
        Thread t3 = new Thread(getRunnableTask());
        Thread t4 = new Thread(getRunnableTask());
        Thread t5 = new Thread(getRunnableTask());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("MAIN finished, i = " + i);
    }

    private static Runnable getRunnableTask() {
        return new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 10000; j++) {
                    i++;
                }
                System.out.println(i);
            }
        };
    }
}
