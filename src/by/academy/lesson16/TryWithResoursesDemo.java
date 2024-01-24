package by.academy.lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResoursesDemo {

	public static void main(String... args) {

	}

//	Использование блока finally для закрытия ресурса
	public static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}

//	Использование конструкции try-with-resources для закрытия ресурса
	public static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

//	Использование конструкции try-with-resources для закрытия нескольких ресурсов
	public static String readFirstLineFromFile2(String path) throws IOException {
		try (FileReader f = new FileReader("a.txt"); BufferedReader br = new BufferedReader(f)) {
			return br.readLine();
		}
	}
}
