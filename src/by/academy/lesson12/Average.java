package by.academy.lesson12;

public class Average<T extends Number/* & Comparable<Number> & Serializable */> {

	private T[] array;

	public Average(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public double average() {
		double sum = 0.0;

		for (T value : array) {
			sum += value.doubleValue();
		}

		return sum / array.length;
	}


	public boolean sameAverage(Average<?> ob){
		//
		return this.average() == ob.average();
	}
}
