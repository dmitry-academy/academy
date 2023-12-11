package by.academy.lesson9.inheritance;

public class Car extends Vehicle {

	private double weight;
	public Car() {
		super();
	}

	public Car(int maxSpeed) {
		super(maxSpeed);
	}

	public void stop() {
		System.out.println("Стоп!");
	}
}
