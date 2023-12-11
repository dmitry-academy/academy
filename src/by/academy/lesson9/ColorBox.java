package by.academy.lesson9;

public class ColorBox extends Box {
	String color;

	double width;
	
	public ColorBox(int width, int height, int depth, String color) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.color = color;
	}

	public ColorBox() {
	}

	@Override
	public void print() {
		System.out.println("ColorBox print" + width);
	}
}