package by.academy.lesson10.date.period;

import java.time.Period;

public class PeriodDemo5 {
    public static void main(String[] args) {
        Period period2d = Period.of(2, 9, 14);
        Period period8d = period2d.withDays(8);
        Period period2y1m2d = period2d.withYears(2).withMonths(1);

        System.out.println(period2d);
        System.out.println(period8d);
        System.out.println(period2y1m2d);
    }
}