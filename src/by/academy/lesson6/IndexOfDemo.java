package by.academy.lesson6;

public class IndexOfDemo {
    public static void main(String[] args) {
        // Java Java Java. I'm coding on Java. Java best coding language.
        String textWithJava = "Java Java Java. I'm coding on Java. Java best coding language.";
        int size = "Java".length();
        int indexStart = textWithJava.length();
        int indexEnd = 0;
        do {
            indexStart = textWithJava.lastIndexOf("Java", indexStart - 1);
            indexEnd = indexStart + size;

            if (indexStart >= 0) {
                System.out.println("Start: " + indexStart + " End: " + indexEnd);
            }
        } while (indexStart >= 0);

        String textWithJavaScript = textWithJava.replace("Java", "JavaScript");
        System.out.println(textWithJavaScript);

        String upperCaseJava = "JAVA";

        System.out.println(upperCaseJava);
        System.out.println(upperCaseJava.toLowerCase());


        String lowerCaseJava = "java";

        System.out.println(lowerCaseJava);
        System.out.println(lowerCaseJava.toUpperCase());



    }
}
