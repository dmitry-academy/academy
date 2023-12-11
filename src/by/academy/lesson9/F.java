package by.academy.lesson9;

public class F extends E {
    int i = 10;

    public F() {
        super();
        System.out.println("В конструкторе F");
    }

    public F(int i) {
        super();
        this.i = i;
        System.out.println("В конструкторе F");
    }
}
