package by.academy.lesson12.examples;
public class GenericSuper<T> {
    private T ob;

    public GenericSuper(T ob) {
        this.ob = ob;
    }

    private T getOb() {
        return ob;
    }
}

