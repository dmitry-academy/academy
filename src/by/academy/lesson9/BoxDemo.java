package by.academy.lesson9;

public class BoxDemo {

	public static void main(String[] args) {
		new Box().print();

		new ColorBox().print();
		new HeavyBox().print();

		((Box) new ColorBox()).print();

		Box test = new ColorBox();
		ColorBox test1 = new ColorBox();

		System.out.println(test.width);
		System.out.println(test1.width);

		test.test();
		test1.test();

//		System.out.println(new Box().width);
//		System.out.println(new ColorBox().width);
//		System.out.println(((Box) new ColorBox()).width);

	}

}
