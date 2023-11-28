package by.academy.lesson7.wrappers;

public class WrappersDemo {
    public static void main(String[] args) {

        int i = 5;
        Integer iW = 5;
        Integer iwc = new Integer(5);
        Integer iwm = Integer.valueOf(5);
        Integer iws = Integer.valueOf("5");

        System.out.println(iW);
        System.out.println(Integer.toOctalString(iW));
        System.out.println(Integer.toHexString(iW));
        System.out.println(Integer.toBinaryString(iW));

//        System.out.println(0 / 0);

        Double d1 = 0.0;
        Double d2 = 0.0;
        System.out.println(d1 / d2);

        Integer intObject = null;
        Integer prim2 = convert(intObject);
        System.out.println(prim2);

    }

    public static Integer convert(int i) {
        System.out.println(i);
        return i;
    }

}
