package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTask3 {
//	Напишите метод, заменяющий в строке каждое второе вхождение 
//	«object-oriented programming» (не учитываем регистр символов) 
//	на «OOP». Например строка
//	"Object-oriented programming is a programming language model 
//	organized around objects rather than "actions" and data rather
//	than logic. Object-oriented programming blabla. 
//	Object-oriented programming bla."
//	должна быть преобразована в 
//	"Object-oriented programming is 
//	a programming language model organized 
//	around objects rather than "actions" and data rather than logic.
//	OOP blabla. Object-oriented programming bla."
	private static final String patternS = "[Oo]bject-oriented programming";
	private static final Pattern pattern = Pattern.compile(patternS);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Object-oriented programming is a programming language model organized around objects rather than 'actions' and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
		Matcher matcher = pattern.matcher(text);

		StringBuilder sb = new StringBuilder();

		int startIndex = 0;
		int findCounter = 0;

		while (matcher.find()) {
			findCounter++;
			int start = matcher.start();
			int end = matcher.end();
				
			sb.append(text.substring(startIndex, start));
			if (findCounter % 2 == 0) {
				sb.append("OOP");
			} else {
				sb.append(text.substring(start, end));
			}
			startIndex = end;
		}
		sb.append(text.substring(startIndex));

		System.out.println(sb);

	}

}
