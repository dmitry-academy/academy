package by.academy.lesson8.classes;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box box1 = new HeavyBox(1, 2, 3);
        Box box2 = new Box(1, 2, 3);

        System.out.println(box1.calcVolume());
        System.out.println(box2.calcVolume());
    }
}
