package by.academy.lesson8.classes;

import java.util.Objects;

public class ShipContainer extends HeavyBox {

    private String shipNumber;

    public ShipContainer() {
        super("Я строка");
        System.out.println("ShipContainer");
    }

    public void someMethod() {
        super.toString();
        calcVolume();
        System.out.println(depth);
    }

    public String getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(String shipNumber) {
        this.shipNumber = shipNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShipContainer that = (ShipContainer) o;

        return Objects.equals(shipNumber, that.shipNumber);
    }

    @Override
    public int hashCode() {
        return shipNumber != null ? shipNumber.hashCode() : 0;
    }

    public String toStringHeavyBox() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "ShipContainer{" +
                "shipNumber='" + shipNumber + '\'' +
                '}';
    }
}
