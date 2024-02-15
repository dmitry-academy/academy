package by.academy.lesson19;

class EggVoice extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
//			try {
//				sleep(1000); // sleep for one second
//			} catch (InterruptedException e) {
//				System.err.println(e);
//			}

			System.out.println("EGG!");
		}
	}
}