package by.academy.lesson10.iterfaces;

public interface Rocketable extends Flyable {

    void rocket();

    default void startEngine() {
        System.out.println("Rocket vehicle launched!");
    }
}
