package by.academy.lesson9;
public class TestMemory {

	public static void main(String[] args) {
		testMemory();
		testMemory();
		testMemory();
	}

	static void testMemory() {
		String s = "1";
		for (int i = 1; i < 100; i++) {
			s += "a";
		}
	}
}