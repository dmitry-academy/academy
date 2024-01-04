package by.academy.lesson13.innerclasses;

public class City {

	public int i = 1;
	public static int j = 2;
	

	public class District {

		int houseNumber = 40;

		public void go() {
			System.out.println(i);
			System.out.println(j);
			System.out.println("Go to the District.");
		}

		public void printHouseNumber() {
			System.out.println("House number: " + houseNumber);
		}
	}

	public void test() {
		System.out.println("allala");
	}

}