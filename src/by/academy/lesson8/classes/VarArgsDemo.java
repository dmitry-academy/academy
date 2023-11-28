package by.academy.lesson8.classes;

public class VarArgsDemo {


    public static void test(int i) {
        System.out.println("ONE param");
        System.out.println(i);
    }

    public static void test(int i1, int i2) {
        System.out.println("TWO param");

        System.out.println(i1);
        System.out.println(i2);
    }

    public static void test(int... vars) {
        System.out.println("VAR ARGS param");

        for (int i : vars) {
            System.out.println(i);
        }
    }
    public static void test(int o, int... vars) {
        System.out.println("VAR ARGS param");

        for (int i : vars) {
            System.out.println(i);
        }
    }
    public static void test(String s, int... vars) {
        System.out.println("VAR ARGS param");

        for (int i : vars) {
            System.out.println(i);
        }
    }

    public static void main(String... args) {

        test(9);
        test(9, 2);
//        test(9,2,3);
//        test(9, 6, 2, 1);
//        test(9, 4, 3);
//        test(9, 1, 23, 5, 76, 8, 56, 74, 64, 56, 456, 4, 56, 456, 45, 64, 56);
    }
}
