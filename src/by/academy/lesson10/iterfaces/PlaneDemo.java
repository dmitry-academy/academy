package by.academy.lesson10.iterfaces;

public class PlaneDemo {
    public static void main(String[] args) {
        Flyable plane = new Plane();
        plane.fly();
        plane.test();

        Plane p1 = new Plane();
        p1.drive();
        p1.test();
        p1.fly();

        Drivable drive = new Plane();
        drive.drive();
        drive.test();
        drive.turnLeft();
        drive.turnRight();

        Rocketable rocket = new Plane();
        rocket.fly();
        rocket.rocket();
        rocket.test();

        Flyable.doSomething();
    }
}
