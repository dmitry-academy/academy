package by.academy.lesson8.classes;

public class BoxDemo1 {
    public static void main(String[] args) {
//        Box myBox = new Box(20, 23, 23);
//// присвоить значение переменным экземпляра mybox
//        myBox.width = 10;
//        myBox.height = 20;
//        myBox.depth = 15;
//// рассчитать объем параллелепипеда
//        double volume = myBox.calcVolume();
//        System.out.println("Объем равен " + volume);

        System.out.println("Color box");
        ColorBox cb1 = new ColorBox(20, 23, 23, "Red");
        System.out.println(cb1.toString());
    }
}
