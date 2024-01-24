package by.academy.lesson15.exception;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		try {
			subMethod("sss");
		} catch (CustomException e) {
			e.printStackTrace();
		}
		System.out.println("Конец программы.");
	}

	public static void subMethod(String str) {
		try {
			parseNumber(str);
		} catch (ParseException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
			throw new CustomException(e.getMessage());
		}
	}

	public static void parseNumber(String str) throws ParseException {
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.parse(str));
	}
}