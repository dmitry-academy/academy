package by.academy.lesson1;

public class Cat {

	private int kolichestvoLap;
	private String name;

	public Cat() {
		this.kolichestvoLap = 4;
	}

	public Cat(int a) {
		this.kolichestvoLap = a;
	}

	public Cat(String name) {
		this.name = name;
		this.kolichestvoLap = 4;
	}

	public Cat(int a, String name) {
		this.name = name;
		this.kolichestvoLap = a;
	}

	public void changeName(String newName) {
		System.out.println("Name changed");
		this.name = newName;
	}

	public void play() {
		System.out.println("Play with: " + name);
	}

	public int getKolichestvoLap() {
		return kolichestvoLap;
	}

	public void setKolichestvoLap(int kolichestvoLap) {
		this.kolichestvoLap = kolichestvoLap;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [kolichestvoLap=");
		builder.append(kolichestvoLap);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
