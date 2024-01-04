package by.academy.lesson13.innerclasses.classwork;

import java.util.Random;

public class RandDemo {
	static Random rand = new Random() {
		@Override
		public int nextInt() {
			return 1;
		}
	};

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			System.out.println(rand.nextInt());
		}

	}

}
