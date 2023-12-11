package by.academy.lesson9;
public class Spoon {
    @Override
    protected void finalize() {
        System.out.println("Ложка исчезает навсегда");
    }
}