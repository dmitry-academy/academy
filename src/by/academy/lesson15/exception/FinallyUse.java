package by.academy.lesson15.exception;

public class FinallyUse {
    // Выход из метода через исключение
    public static void procA() {
        try {
            System.out.println("Внутри procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally для procA ");
        }
    }

    // Возврат изнутри try-блока
    public static int procB() {
        try {
            System.out.println("Внутри procB");
            return 1;
        } finally {
            System.out.println("finally для procB ");
            return 2;
        }
    }

    // Нормальное выполнение try-блока
    public static void procC() {
        try {
            System.out.println("Внутри procC");
        } finally {
            System.out.println("finally procC");
        }
        System.out.println("конец метода для procC ");
    }

    public static void main(String[] args) {
//		try {
//			procA();
//		} catch (Exception e) {
//			System.out.println("Исключение выброшено");
//		}
        int i = procB();
        System.out.println(i);
//		System.out.println("method main");
//		procC();
    }
}