package by.academy.lesson16;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// Создать папку "myPackage" с файлом "myFirstFile.txt" внутри.
// Запустить программу 2 раза. Программа должна запускаться без ошибок.
// пробежаться по всем файлам в папке academy и вывести имена файлов на экран (не папок)
public class FileDemo {
	public static void main(String[] args) throws IOException {

		File dirs = new File("src/io/1/2/3/4/5/6/7/8/9");

		if (!dirs.exists()) {
			dirs.mkdirs();
		}
		File file = new File(dirs, "Hello_World.txt");

		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println(file.isAbsolute());

		for (File f : dirs.listFiles()) {
			System.out.println("Имя файла: " + f.getName());
			System.out.println("Путь: " + f.getPath());
			System.out.println("Абсолютный путь: " + f.getAbsolutePath());
			System.out.println("Родительский каталог: " + f.getParent());
			System.out.println(f.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
			System.out.println(f.canWrite() ? "Файл/каталог доступен для редактирования."
					: "Файл/каталог не доступен для редактирования.");
			System.out.println(
					f.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
			System.out.println((f.isDirectory() ? "Каталог." : "Не каталог."));
			System.out.println(f.isFile() ? "Файл." : "Не файл.");
			System.out.println(f.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
			System.out.println("Дата последнего редактирования: " + new Date(f.lastModified()));
			System.out.println("Размер: " + f.length() + " байт.");

			System.out.println("----------------------------------------------------------");
		}
//		System.out.println("Имя файла: " + file.getName());
//		System.out.println("Путь: " + file.getPath());
//		System.out.println("Абсолютный путь: " + file.getAbsolutePath());
//		System.out.println("Родительский каталог: " + file.getParent());
//		System.out.println(file.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
//		System.out.println(file.canWrite() ? "Файл/каталог доступен для редактирования."
//				: "Файл/каталог не доступен для редактирования.");
//		System.out
//				.println(file.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
//		System.out.println((file.isDirectory() ? "Каталог." : "Не каталог."));
//		System.out.println(file.isFile() ? "Файл." : "Не файл.");
//		System.out.println(file.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
//		System.out.println("Дата последнего редактирования: " + file.lastModified());
//		System.out.println("Размер: " + file.length() + " байт.");
	}
}