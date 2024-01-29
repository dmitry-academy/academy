package by.academy.lesson16;

import java.io.*;

public class FileWriterReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/io/1/2/3/4/5/6/7/8/9/Hello_World.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        try (
                BufferedReader fr = new BufferedReader(new FileReader(file));
                FileWriter fw = new FileWriter(file, true);
        ) {

            fw.write("Learn\nJava!\n");

//            fw.flush();
            String s;
            while ((s = fr.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}