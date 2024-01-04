package by.academy.lesson13.innerclasses.classwork;


import by.academy.lesson10.iterfaces.Flyable;

public class AnimalDemo {
	public static void main(String[] args) {
//		Creature cat = new Cat();
//
//		Creature creature = new Creature() {
//
//			@Override
//			public void eat() {
//				System.out.println("алала я создание алала");
//			}
//
//		};
		
//		creature.eat();
//		creature.say();
//
//		Flyable f = new Flyable() {
//			@Override
//			public void fly() {
//				System.out.println(" я муха я летаю");
//			}
//		};
//
//		callFly(new Flyable() {
//			@Override
//			public void fly() {
//				System.out.println(" я муха я летаю");
//			}
//		});
	}

	public static void callFly(Flyable f) {
		f.fly();
	}
}
