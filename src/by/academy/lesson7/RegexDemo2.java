package by.academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Изменить регулярное выражение в примере для нахождения строк cab, ccab, cccab.

public class RegexDemo2 {
    public static void main(String[] args) {
        String[] strings = {"cab", "ccab", "cccab", "ccccccccccccccccccccccccccccccab", "ab", "ac", "a"};
        Pattern pattern = Pattern.compile("c+ab");
        for (int i = 0; i < strings.length; i++) {
            Matcher matcher = pattern.matcher(strings[i]);
            boolean b = matcher.matches();
            System.out.println(b);
        }
    }
}