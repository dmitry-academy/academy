package by.academy.lesson6;

public class SubstringDemo {
    public static void main(String[] args) {
        String text = "Java Java Java. I'm coding on Java. Java best coding language.";

        String string1 = text.substring(0, text.length() / 2);
        System.out.println(string1);

        String string2 = text.substring(text.length() / 2, text.length());
        System.out.println(string2);
    }
}
