package by.academy.lesson12.file;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\dmitrysc\\git\\academy\\academy");

		System.out.println("Имя файла: " + file.getName());
		System.out.println("Путь: " + file.getPath());
		System.out.println("Абсолютный путь: " + file.getAbsolutePath());
		System.out.println("Родительский каталог: " + file.getParent());
		System.out.println(file.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
		System.out.println(file.canWrite() ? "Файл/каталог доступен для редактирования."
				: "Файл/каталог не доступен для редактирования.");
		System.out
				.println(file.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
		System.out.println((file.isDirectory() ? "Каталог." : "Не каталог."));
		System.out.println(file.isFile() ? "Файл." : "Не файл.");
		System.out.println(file.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
		System.out.println("Дата последнего редактирования: " + file.lastModified());
		System.out.println("Размер: " + file.length() + " байт.");

		for (File f : file.listFiles()) {
			System.out.println(f.getName());
		}
	}
}