package by.academy.lesson6;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" ").append("Java").append(" ").append("!!!").append(123).append('r');

        System.out.println(sb);


        String text = "C#";
        StringBuilder sb1 = new StringBuilder(text);

        System.out.println(sb1.charAt(0));

        System.out.println(sb1);
        sb1.setCharAt(1, '+');
        System.out.println(sb1);


        String text1 = "Не следует, однако забывать, что новая модель организационной деятельности в значительной степени обуславливает создание направлений прогрессивного развития. Значимость этих проблем настолько очевидна, что постоянное информационно-пропагандистское обеспечение нашей деятельности позволяет выполнять важные задания по разработке модели развития.";
        StringBuilder sb2 = new StringBuilder(text1);
        int indexStart = text1.indexOf("следует");

        sb2.replace(indexStart, indexStart + "следует".length(), "нужно");
        System.out.println(sb2);

        sb2.insert(10, "JAVA");
        System.out.println(sb2);

        sb2.delete(10, 10 + "JAVA".length());
        System.out.println(sb2);

        sb2.deleteCharAt(2);
        System.out.println(sb2);

        sb2.reverse();
        System.out.println(sb2);

        StringBuilder sb4 = new StringBuilder("А роза упала на лапу Азора");
        sb4.reverse();
        System.out.println(sb4);
    }
}

