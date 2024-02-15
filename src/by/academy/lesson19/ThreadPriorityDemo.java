package by.academy.lesson19;

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        ThreadTask t = new ThreadTask("new thread");
        t.setPriority(10);
        System.out.println(t.getPriority());
        t.start();
    }

}
