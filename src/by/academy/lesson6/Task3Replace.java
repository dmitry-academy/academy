package by.academy.lesson6;

//Задание 3.
//
//        Напишите метод, заменяющий в строке каждое второе вхождение
//        «object-oriented programming» (не учитываем регистр символов) на «OOP».
//        Например строка:
//        "Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
//        должна быть преобразована в
//        "Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming
//        bla."
public class Task3Replace {
    public static void main(String[] args) {

        String source = "Object-oriented programming";
        String target = "OOP";

        String text = "Object-oriented programming is a programming language model organized around objects rather than 'actions' and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

        StringBuilder sb = new StringBuilder();

        int startIndex = 0;
        int findCounter = 0;

        do {
            int start = text.indexOf(source);
            int end = start + target.length();
            if (startIndex < start) {
                sb.append(text.substring(startIndex, start));
            }
            if (findCounter % 2 == 0) {
                sb.append("OOP");
            } else {
                sb.append(text.substring(start, end));
            }
            startIndex = end;
            if (start > 0) {
                findCounter++;
            }
            System.out.println(startIndex);
        } while (startIndex >= 0);
        sb.append(text.substring(startIndex));

        System.out.println(sb);
    }
}
