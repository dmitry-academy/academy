package by.academy.lesson13.innerclasses;

public class Town3 {
	private String postCode = "33333";
	private int test = 0;

	// Если локальный класс объявлен внутри статического метода,
	// он имеет доступ только к статическим переменным класса:
	public void createAddress() {
		final int houseNumber = 34;
		class Street {
			public void printAddress() {
//				postCode = "ad";
//				houseNumber++;
//				test++;
				System.out.println("PostCode is " + postCode);
				System.out.println("House Number is " + houseNumber);
			}
		}
		Street street = new Street();
		street.printAddress();
	}

	public static void main(String[] args) {

		Town3 t = new Town3();
		t.createAddress();
	}
}