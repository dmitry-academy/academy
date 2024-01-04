package by.academy.lesson13.innerclasses.classwork;

public class LocalClassDemo {

	public static void main(String[] args) {

		int i = 0;
		class LocalClass {

			LocalClass() {
				super();
			}

			void test() {
				System.out.println("test" + i);
			}
		}
		LocalClass c = new LocalClass();
		c.test();
	}

}
