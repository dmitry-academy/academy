package by.academy.lesson3.operators;

public class IncrementDecrement {
	public static void main(String[] args) {
		int a = 1;
		int b = --a; // 2
		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum += 1;
//		++sum;
		
		System.out.println(sum--);
		System.out.println(sum);

//        int c = ++a;
//        c++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
//        System.out.println("c = " + c);
	}
}