package by.academy.lesson9.statics;

public class Runner {
	public static void main(String[] args) {
		Base obj = new Sub();
		Base.go();
		Sub.go();

		System.out.println(Base.PI);
//		Base ob = new Sub();
//		ob.go();
//		Sub.go();

//		StaticDemo s0 = new StaticDemo();
//		StaticDemo s1 = new StaticDemo();
//		StaticDemo s2 = new StaticDemo();

//		StaticDemo.staticIntVariable++;
//		StaticDemo.staticIntVariable++;
//		StaticDemo.staticIntVariable++;
//		System.out.println(s0.staticIntVariable);
//		System.out.println(s1.staticIntVariable);

//
//		StaticDemo.intVariable++;
//		System.out.println(s.intVariable);
//		System.out.println(s1.intVariable);

//		System.out.println(StaticDemo.intVariable);
//		StaticDemo.doSomething();

	}
}