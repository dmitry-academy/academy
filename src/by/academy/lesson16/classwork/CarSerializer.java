package by.academy.lesson16.classwork;

import by.academy.lesson9.C;
import by.academy.lesson9.F;

import java.io.*;

public class CarSerializer {

    public static void main(String[] args) throws IOException {

        Car c1 = new Car();
        c1.setOwner("Илон Маск");
        c1.setModel("Волга");
        c1.setPrice(100000);

        Car c2 = new Car();
        c2.setPrice(1000);
        c2.setModel("Белджи x50");
        c2.setOwner("Директор");

        File f = new File("src/io/cars.txt");

        if (!f.exists()) {
            f.createNewFile();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
            oos.writeObject(c1);
            oos.writeObject(c2);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
