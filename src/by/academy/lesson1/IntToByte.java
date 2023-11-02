package by.academy.lesson1;

public class IntToByte {

	public static void main(String[] args) {
		byte b = 127;
		int i = 222;

		System.out.println(b);
		System.out.println(i);

//		i = b;
//		System.out.println(i);

		b = (byte) i;
		System.out.println(b);

		byte b1 = 127;
		b1 += 1;
		System.out.println(b1);
	}

}
