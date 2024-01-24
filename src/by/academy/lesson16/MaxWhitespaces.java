package by.academy.lesson16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MaxWhitespaces {

	public static final String INPUT_FILE_PATH = "src\\io\\max.txt";
	public static final String OUTPUT_FILE_PATH = "src\\io\\max_fixed.txt";

	public static void main(String[] args) throws IOException {
		File dir = new File("src/io/");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File inputFile = new File(INPUT_FILE_PATH);
		if (!inputFile.exists()) {
			inputFile.createNewFile();
		}

		File outputFile = new File(OUTPUT_FILE_PATH);
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}

		try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
				FileWriter fileWriter = new FileWriter(outputFile)) {
			String a = null;

			while ((a = fileReader.readLine()) != null) {
				fileWriter.write(a.trim());
			}
		}
	}

}
