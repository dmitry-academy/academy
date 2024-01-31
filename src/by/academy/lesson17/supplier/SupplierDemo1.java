package by.academy.lesson17.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo1 {
	public static void main(String[] args) {

		Random rand = new Random();

		Supplier<Integer> supplierStr = () -> rand.nextInt(10);

		System.out.println(supplierStr.get());

	}
}