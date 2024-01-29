package by.academy.lesson16;

import javax.sound.midi.Soundbank;
import java.io.Closeable;
import java.io.IOException;

public class CloseableObject implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("ALALALA мы закрываем объект автоматически");
    }
}
