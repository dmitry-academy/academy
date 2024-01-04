package by.academy.lesson12.examples;

public class GenRestriction<T> {
	private T ob;
	private T[] array;

	@SuppressWarnings("unchecked")
	public GenRestriction(T ob, T[] array) {
		// Недопустимо!!!
//		оb = (T) new Object();
//		array = (T[]) new Object[10];
		this.ob = ob;
		this.array = array;
	}
}