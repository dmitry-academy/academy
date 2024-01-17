package by.academy;

import java.util.Iterator;

public class CustomLinkedListDemo {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        Iterator<Integer> iterator = list.iterator();

        System.out.println("Iterator for each");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------");
        list.print();
        System.out.println("Size: " + list.getSize());
//
//        System.out.println("-------------");
//        System.out.println(list.get(4));
//        System.out.println(list.get(0));
//
//        list.get(-1);
//        list.get(5);

//        list.removeTail();
//        list.print();
//        System.out.println("Size: " + list.getSize());
//
//        list.removeHead();
//        list.removeHead();
//        list.removeHead();
//        list.removeHead();
//        list.print();
//        System.out.println("Size: " + list.getSize());

        list.remove(1);
        list.remove(1);
        list.remove(1);
        list.remove(1);

        list.print();
        System.out.println("Size: " + list.getSize());

        list.remove(1);


    }
}
