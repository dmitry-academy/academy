package by.academy.lesson16.classwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (InputStream input =
                     new FileInputStream("src/io/1/2/3/4/5/6/7/8/9/Hello_World.txt")) {

            for (int i = 0; i < input.available(); i++) {
                // Чтение текстового файла посимвольно
                int c = input.read();
                System.out.print(c + " (");
                System.out.print((char) c + ") ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}