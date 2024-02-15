package by.academy.lesson20;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {

		JoinRunnable a = new JoinRunnable("A");
		JoinRunnable b = new JoinRunnable("B");
		JoinRunnable c = new JoinRunnable("C");

		a.start();

//		System.out.println(Thread.currentThread().getState());
//		a.join();
		b.start();
		c.start();
//		try {
			a.join(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
//		try {
		b.join(10000);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}

		c.join(1000);
		System.out.println("test");
		System.out.println(Thread.currentThread().getState());
	}
}