package by.academy.lesson10.iterfaces;

public class Plane implements Rocketable, Drivable {

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    @Override
    public void test() {
        System.out.println("I can test!");
    }

    @Override
    public void drive() {
        System.out.println("I can drive!");
    }

    @Override
    public void rocket() {
        System.out.println("Rocket jump!");
    }

    @Override
    public void startEngine() {
        Rocketable.super.startEngine();
        Drivable.super.startEngine();
    }

    @Override
    public void turnLeft() {
        Drivable.super.turnLeft();
        System.out.println("alalal");
    }
}
