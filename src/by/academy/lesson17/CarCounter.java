package by.academy.lesson17;

public class CarCounter {

    public static void main(String[] args) {
        Car[] cars = {new Car(CarTypes.SPORT, 34000),
                new Car(CarTypes.SPORT, 44000),
                new Car(CarTypes.COMPACT, 14000),
                new Car(CarTypes.COMPACT, 10000),
                new Car(CarTypes.BIG, 25000)};

        Searchable searchable = new Searchable() {
            @Override
            public boolean accept(Car c) {
                return CarTypes.BIG == c.getType();
            }
        };
//        @FunctionalInterface
//        public interface Searchable {
//            boolean accept(Car car);
//        }
        Searchable expensive = c -> c.getCost() > 25000;
        Searchable cheap = c -> c.getCost() > 25000;
        Searchable sport = c -> c.getType() == CarTypes.SPORT;
        Searchable big = c -> c.getType() == CarTypes.BIG;
        Searchable compact = c -> c.getType() == CarTypes.COMPACT;

        System.out.println(countCars(cars, c -> CarTypes.COMPACT == c.getType()));
        System.out.println(countCars(cars, c -> c.getCost() > 10000));
        System.out.println(countCars(cars, searchable));
        System.out.println(countCars(cars, searchable));
        System.out.println(countCars(cars, searchable));

    }

    public static int countCars(Car[] cars, Searchable searchable) {
        int counter = 0;

        for (Car c : cars) {
            if (searchable.accept(c)) {
                counter++;
            }
        }
        return counter;
    }
//
//    public static int countExpensiveCars(Car[] cars) {
//        int counter = 0;
//
//        for (Car c : cars) {
//            if (c.getCost() > 30000) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//
//    public static int countBigCars(Car[] cars) {
//        int counter = 0;
//
//        for (Car c : cars) {
//            if (c.getType() == CarTypes.BIG) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//
//    public static int countSportCars(Car[] cars) {
//        int counter = 0;
//
//        for (Car c : cars) {
//            if (c.getType() == CarTypes.SPORT) {
//                counter++;
//            }
//        }
//        return counter;
//    }
}
