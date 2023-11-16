package by.academy.lesson4.arrays;

import java.util.Random;

public class TwoDArray1 {
	public static void main(String[] args) {
		int[][] twoD = new int[4][5];
		int i, j = 0;

		Random rand = new Random();
		for (i = 0; i < 4; i++) {

			for (j = 0; j < 5; j++) {

				twoD[i][j] = rand.nextInt(11) - 5;
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
	}
}