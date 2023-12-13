package by.academy.lesson8.classes;

public class BoxDemo4 {

    public static void main(String[] args) {
        Box b = new ColorBox();
        ColorBox cBox = new ColorBox();
        HeavyBox heavyBox = new HeavyBox();

        Box cBox1 = new ColorBox();
        Box hBox1 = new HeavyBox();

        printBox(cBox);
        printBox(hBox1);
        printBox(b);
        printBox(heavyBox);
    }

    public static void printBox(Box box) {
        System.out.println(box.calcVolume());
    }

    public static void calcDiscount(Box box) {
        System.out.println(box.discount() + 1);
    }
}
