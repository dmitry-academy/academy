package by.academy.lesson16.classwork;

import java.io.Serializable;

public class Car implements Serializable {

    private String model;
    private double price;

    private transient String owner;

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}';
    }
}
