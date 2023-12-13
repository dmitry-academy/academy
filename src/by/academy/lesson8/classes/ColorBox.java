package by.academy.lesson8.classes;

public class ColorBox extends Box {

    private String color;

    public ColorBox() {
        super();
    }

    public ColorBox(double weight, double height, double depth) {
        super(weight, height, depth);
    }

    public ColorBox(double weight, double height, double depth, String color) {
        super(weight, height, depth);
        this.color = color;
    }

    @Override
    public double discount() {
        return 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
