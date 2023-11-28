package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
	public static void main(String[] args) {
		System.out.println(test("google.com"));
		System.out.println(test("google.net"));
		System.out.println(test("reference1.ua"));
		System.out.println(test("reference1.org"));
		System.out.println(test("reference1.io"));
		System.out.println(test("Hello world"));

	}

	public static boolean test(String testString) {
		Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
		Matcher matcher = pattern.matcher(testString);
		return matcher.matches();
	}
}