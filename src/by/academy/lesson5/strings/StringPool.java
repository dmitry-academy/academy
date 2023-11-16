package by.academy.lesson5.strings;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s3.intern();
        System.out.println("s1 == s2 :" + (s1 == s2));
        System.out.println("s1 == s3 :" + (s1 == s3));
        System.out.println("s1 == s4 :" + (s1 == s4));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("--equals");
        System.out.println("CAT".equals("CAt"));
        System.out.println("--equalsIgnoreCase");
        System.out.println("CAT".equalsIgnoreCase("cat"));

        System.out.println("--startsWith");
        System.out.println("I'm learning java".startsWith("I'm"));
        System.out.println("I'm learning java".startsWith("You"));

        System.out.println("--endsWith");
        System.out.println("I'm learning java".endsWith("java"));
        System.out.println("I'm learning java".endsWith("You"));

        System.out.println("--regionMatches");
        System.out.println("I'm living in Minsk".regionMatches(5, "living", 1, 5));

        System.out.println("--contains");
        System.out.println("I'm learning java".contains("java"));

        System.out.println("--compareTo");
        System.out.println("abc".compareTo("cbc"));
        System.out.println("bbc".compareTo("abc"));
        System.out.println("abc".compareTo("abc"));

        System.out.println("a".compareTo("aaa"));

        System.out.println("Academy".charAt(3));
    }
}
