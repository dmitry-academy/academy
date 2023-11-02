package by.academy.lesson1;

public class CatApp {

	public static void main(String[] args) {
		Cat cat = new Cat();

		cat.nickname = "Пушок";
		cat.age = 29000;

		Cat cat1 = new Cat();

		cat1.nickname = "Рыжик";
		cat1.age = 9000;

		cat.eat();
		cat.murlikat();
		cat.sleep();

		cat1.eat();
		cat1.murlikat();
		cat1.sleep();

		Cat cat3 = new Cat("Шарик");
		cat3.sleep();
		
		Cat cat4 = new Cat("Барсик", 1000);
		cat4.sleep();

	}

}
