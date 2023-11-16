package by.academy.lesson4.loops;

public class ForEach {
	public static void main(String[] args) {

		String[][] arr = { { "Hello", "world", "academy" }, { "Hello", "world", "academy" } };
//		for (int j = 0; j < arr.length; j++) {
//			
//			for (int i = 0; i < arr[j].length; i++) {
//				System.out.println("Значение: " + arr[j][i]);
//			}
//			
//		}
		for (String[] strArr : arr) {
			for (String str : strArr) {
				System.out.println("Значение: " + str);
			}
		}
		
//		String[] arr1 = { "Hello", "world", "academy" };
//		
//		for (String str : arr1) {
//			System.out.println("Значение: " + str);
//		}

	}
}