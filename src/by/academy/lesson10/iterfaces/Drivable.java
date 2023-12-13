package by.academy.lesson10.iterfaces;

public interface Drivable {
    void drive();

    void test();

    default void startEngine() {
        System.out.println("Drivable vehicle launched!");
    }

    default void turnLeft() {
        System.out.println("Turn left!");
    }

    default void turnRight() {
        System.out.println("Turn right!");
    }

    private void privateFunctionality() {
        System.out.println();
    }
}
