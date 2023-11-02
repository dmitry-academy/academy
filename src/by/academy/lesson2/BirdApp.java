package by.academy.lesson2;

public class BirdApp {

	public static void main(String[] args) {

		Bird vorobei = new Bird("мелкий");
		String vorobeiSize = vorobei.getSize();

		System.out.println(vorobeiSize);
		vorobei.setType("WILD");
		String vorobeiType = vorobei.getType();
		System.out.println(vorobeiType);
	}

}
