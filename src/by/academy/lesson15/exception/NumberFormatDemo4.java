package by.academy.lesson15.exception;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;

public class NumberFormatDemo4 {
    public static void main(String[] args) {
        try {
            NumberFormat nf = NumberFormat.getInstance();
            System.out.println(nf.parse("qwe1234,567"));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse("1234,567"));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            e.printStackTrace();
        }

    }
}