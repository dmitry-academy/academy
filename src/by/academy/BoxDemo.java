package by.academy;

import by.academy.lesson1.Cat;

public class BoxDemo {
    public static void main(String[] args) {
        CatBox catBox = new CatBox(new Cat());

        catBox.setCat(new Cat());
        System.out.println(catBox.getCat());
    }
}
