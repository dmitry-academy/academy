package by.academy.lesson8.classes;

public class Box {

    double height;
    double width;
    double depth;

    public Box() {
        super();
        System.out.println("Box");
    }

    public Box(double height, double width, double depth) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Box(double height, double width, double depth, String name) {
        this(height, width, depth);
        System.out.println(name);
    }

    public void setDim(double height, double width, double depth) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public double calcVolume() {
        return width * height * depth;
    }

    public void setHeight(String height) {
        this.height = Double.valueOf(height);
    }

    public void setHeight(Integer height) {
        this.height = (double) height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setHeight(Double height, String name) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
