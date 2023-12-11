package by.academy.lesson9;

public class BoxDemo1 {
	public static void main(String[] args) {
		Box myBox = new Box(1, 2, 3);
		// присвоить значение переменным экземпляра mybox
		System.out.println(myBox);
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		System.out.println(myBox);

		// рассчитать объем параллелепипеда
		double volume = myBox.width * myBox.height * myBox.depth;
		System.out.println("Объем равен " + volume);
	}
}