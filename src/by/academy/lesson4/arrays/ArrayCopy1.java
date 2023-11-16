package by.academy.lesson4.arrays;

import java.util.Arrays;

public class ArrayCopy1 {
	public static void main(String[] args) {
		int[] arraySource = { 1, 2, 3, 4, 5, 6 };
		int[] clonedArray = new int[arraySource.length * 2];

//		for (int i = 0; i < arraySource.length; i++) {
//			clonedArray[i] = arraySource[i];
//		}
		System.arraycopy(arraySource, 0, clonedArray, 0, arraySource.length);

		System.out.println("arraySource: " + Arrays.toString(arraySource));
		System.out.println("clonedArray: " + Arrays.toString(clonedArray));

//		int[] arrayDestination = new int[10];
//		System.out.println("arraySource: " + Arrays.toString(arraySource));
//		System.out.println("arrayDestination: " + Arrays.toString(arrayDestination));
//
//		System.arraycopy(arraySource, 0, arrayDestination, 0, arraySource.length);
//		System.out.println("arrayDestination after arrayCopy: " + Arrays.toString(arrayDestination));
	
	}
}
