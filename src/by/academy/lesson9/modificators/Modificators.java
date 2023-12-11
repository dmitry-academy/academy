package by.academy.lesson9.modificators;

public class Modificators {

	private String[] array;
	public int publicVar; // открытый уровень доступа
	private int privateVar; // закрытый уровень доступа
	int defaultVar; // уровень доступа по умолчанию
	protected int protectedVar; // уровень доступа по protected

	public void addToArray(int index, String value) {
		if (array != null && array.length > index) {
			array[index] = value;
		}
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "Modificators{" + "publicVar=" + publicVar + ", privateVar=" + privateVar + ", defaultVar=" + defaultVar
				+ '}';
	}
}