package by.academy.lesson8.deal;

import java.time.LocalDate;
import java.util.Scanner;

public class DealApp {
    public static void main(String[] args) {
        // validate 1
        // validate 2

        Scanner sc = new Scanner(System.in);
        String dateStr = sc.next();
        LocalDate date = null;
//        if (date1Validator.validate(dateStr)) {
//            date = parseFormat1(dateStr);
//        } else if (date2Validator.validate(dateStr)) {
//            date = parseFormat1(dateStr);
//        } else {
//            System.out.println("invalid date format");
//        }

    }


    public static LocalDate parseFormat1(String date) {
        return LocalDate.now();
    }

    public static LocalDate parseFormat2(String date) {
        return LocalDate.now();
    }
}
