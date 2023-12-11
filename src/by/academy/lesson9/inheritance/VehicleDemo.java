package by.academy.lesson9.inheritance;

public class VehicleDemo {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.maxSpeed);

		Car c1 = new Car(123);
		System.out.println(c1.maxSpeed);
		c1.drive();
		c1.stop();

		Vehicle c2 = new Car(123);
		System.out.println(c2.maxSpeed);
		c2.drive();
//		c2.stop();
		System.out.println(c2.maxSpeed);

		c2.maxSpeed = 100;
		Car c3 = (Car) c2;
		c3.stop();
		System.out.println(c3.maxSpeed);

		
		Car c4 = (Car) new Vehicle();
	}

}
