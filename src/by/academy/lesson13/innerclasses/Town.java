package by.academy.lesson13.innerclasses;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private String postCode = "33333";
    private int x = 3;
    private List<Street> streets = new ArrayList<>();

    public void printAllStreetX() {
        for (Street s : streets) {
            System.out.println(s.getHouseNumber());
        }
    }

    public Town() {
        super();
    }

    public Town(int x) {
        super();
        this.x = x;
    }

    class Street {
        private int house;
        private int houseNumber = 2;

        private int x = 10;

        public Street() {
            super();
            streets.add(this);
        }

        public Integer getHouseNumber() {
            return houseNumber;
        }

        public class House {
            private int x = 0;

            public void test(int x) {
                System.out.println(x); // 1
                System.out.println(this.x);// 0
                System.out.println(houseNumber);// 2
                System.out.println(Town.this.x);// 3
            }
        }

        public void printAddress() {
            System.out.println("Город " + Town.this);
            System.out.println("Индекс " + postCode);
            System.out.println("Улица " + this);
            System.out.println("Дом " + house);
            System.out.println("----------------");
        }

        public void testX(int x) {
            System.out.println(x);
            System.out.println(this.houseNumber);
            System.out.println(Town.Street.this.x);
            System.out.println(Town.this.x);
        }

    }

    public static void main(String[] args) {
        Town town = new Town();
        Street street1 = town.new Street();

        Street.House house1 = street1.new House();

        Street street2 = new Town().new Street();

        Street.House house = new Town().new Street().new House();
        System.out.println(house.getClass());
        house.test(1);
//		town.createStreet();
//		street1.printAddress();
//		street2.printAddress();
//
        street1.testX(1);
    }

    public void createStreet() {
        Street street = new Street();
        street.house = 78;
        street.printAddress();
        System.out.println(postCode);
    }
}