package anonymousclasses;

import java.util.Comparator;
import java.util.TreeSet;

public class AnonymousClassVisibility {

	private int field = 99;

	public static void main(String[] args) {
		AnonymousClassVisibility obj = new AnonymousClassVisibility();
		obj.visiblityTest();
	}

	private static void test() {
		// System.out.println(field);
	}

	// if method was static
	// anonymous class can not access class level fields,instance fields/methods
	// but can access local variable
	private /* static */ void visiblityTest() {
		int ka = 10;
		// effectively final field as used inside anonymous class
		// ka=99;
		Comparator<Integer> intComparator = new Comparator<Integer>() {

			public int compare(Integer one, Integer two) {
				System.out.println("called for one:"+one+", two:"+two);
				System.out.println("init field " + field + ", local field " + ka);
				return one.compareTo(two);
			}
		};
		// effectively final field as used inside anonymous class
		// ka=99;
		TreeSet<Integer> treeSet = new TreeSet<>(intComparator);
		treeSet.add(23);
		treeSet.add(1); // comapre once
		treeSet.add(0);//compare twice
		treeSet.add(33);//compare thrice

	}
}
