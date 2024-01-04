package by.academy.lesson12.examples;

public class GenConstructor {

	private double value;

	public <T extends Number> GenConstructor(T arg) {
		this.value = arg.doubleValue();
	}

	public void showValue() {
		System.out.println("value: " + value);
	}
}
