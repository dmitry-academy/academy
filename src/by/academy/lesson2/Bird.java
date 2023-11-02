package by.academy.lesson2;

public class Bird {

	String size;
	String type;
	double weight;

	public Bird() {
		super();
	}

	public Bird(String size) {
		super();
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
