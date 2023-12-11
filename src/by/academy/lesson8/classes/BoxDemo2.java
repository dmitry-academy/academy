package by.academy.lesson8.classes;

public class BoxDemo2 {
    public static void main(String[] args) {
        ColorBox box0 = new ColorBox();
        Box box1 = new ColorBox();
        box0.setHeight(1);
        box0.calcVolume();
        box0.getColor();

        box1.calcVolume();
//        box1.getColor();

        Box box2 = new HeavyBox();

        // ColorBox box3 = new Box(); нельзя!
        // ColorBox box4 = new HeavyBox(); нельзя!
    }
}
