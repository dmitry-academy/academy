package by.academy.lesson9.inheritance;

public class Vehicle {
	public int maxSpeed;

	public Vehicle() {
		super();
		this.maxSpeed = 10;
	}

	public Vehicle(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

	public void drive() {
		System.out.println("Поехали");
	}
}
