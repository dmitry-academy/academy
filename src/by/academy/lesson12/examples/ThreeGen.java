package by.academy.lesson12.examples;

import by.academy.lesson8.deal.Product;

import java.io.Serializable;

//а) Создать обобщенный класс с тремя параметрами (T, V, K). 
//Класс содержит три переменные типа (T, V, K), 
//конструктор, принимающий на вход параметры типа (T, V, K), 
//методы возвращающие значения трех переменных. 
//Создать метод, выводящий на консоль имена классов для трех 
//переменных класса.
//б) Наложить ограничения на параметры типа: T должен реализовать 
//интерфейс Comparable (классы-оболочки, String), 
//V должен реализовать интерфейс Serializable и расширять класс Animal, 
//K должен расширять класс Number.

public class ThreeGen<T extends CharSequence & Comparable<T>, V extends Product & Serializable, K extends Number> {

	private T objT;
	private V objV;
	private K objK;

	public ThreeGen() {
		super();
	}

	public ThreeGen(T objT, V objV, K objK) {
		super();
		this.objT = objT;
		this.objV = objV;
		this.objK = objK;
	}

	public T getObjT() {
		return objT;
	}

	public V getObjV() {
		return objV;
	}

	public K getObjK() {
		return objK;
	}

	public void printObjectClasses() {
		System.out.println(objT.getClass().getName());
		System.out.println(objV.getClass().getName());
		System.out.println(objK.getClass().getName());
	}

	public static void main(String... args) {
//		ThreeGen<String, Product, Integer> object = new ThreeGen<>("Hello world", new Cheese(), 123);
//		object.printObjectClasses();
	}
}
