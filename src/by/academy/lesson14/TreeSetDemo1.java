package by.academy.lesson14;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
//		SortedSet<String> treeSet = new TreeSet<>();
//
//		treeSet.add("Минск");
//		treeSet.add("Брест");
//		treeSet.add("Могилев");
//		treeSet.add("Гродно");
//		treeSet.add("Гомель");
//		treeSet.add("Минск");
//
//		System.out.println(treeSet);

		SortedSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("compare" + o1 + " " + o2);
				return o1.compareTo(o2);
			}
		});
		
		treeSet.add(9);
		treeSet.add(5);
		treeSet.add(17);
		treeSet.add(-123);
		treeSet.add(123);
		System.out.println(treeSet);

//		SortedSet<WrongHashCat> treeSet = new TreeSet<>(new Comparator<WrongHashCat>() {
//
//			@Override
//			public int compare(WrongHashCat o1, WrongHashCat o2) {
////				System.out.println("compare" + o1 + " " + o2);
//				return o1.getUsername().compareTo(o2.getUsername());
//			}
//		});

//		treeSet.add(new WrongHashCat("Alala"));
//		treeSet.add(new WrongHashCat("1Alala"));
//		treeSet.add(new WrongHashCat("2Alala"));
//		treeSet.add(new WrongHashCat("3Alala"));

		System.out.println(treeSet);

	}
}