package by.academy.homework;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        /**
         * Можно писать все в main. Не нужно создавать новых классов.
         * Имеется текст. Следует составить для него частотный словарь:
         * Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.
         */

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor";


        Map<Character, Integer> charsCounter = new HashMap<>();
        for (char c : text.toCharArray()) {
            charsCounter.put(c, charsCounter.getOrDefault(c, 0) + 1);
//            if (charsCounter.containsKey(c)) {
//                charsCounter.put(c, charsCounter.get(c) + 1);
//            } else {
//                charsCounter.put(c, 1);
//            }
        }
    }
}
