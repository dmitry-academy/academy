package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
//	private static final String stringPattern = "c[a|o|u](de)+[S]*";
//	private static finalString stringPattern = "(de){1,2}";
	private static final String stringPattern = "de";
	private static final Pattern pattern = Pattern.compile(stringPattern);

	public static void main(String[] args) {

		String text = "codededede 777 cade cudeSS";

		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println("FIND!");
			System.out.println("start index: " + matcher.start());
			System.out.println("end index: " + matcher.end());
			System.out.println(text.substring(matcher.start(), matcher.end()));
			System.out.println("--------------------");
		}
	}
}