package common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AddingNullInAllLists {
	public static void main(String[] args) {
		// arraylist do supports entering any numbers of null items
		List<String> arrayList = new ArrayList<String>();
		populateNullsInList(arrayList);
		System.out.println("======================");

		// linked list do support entering any number of null items
		List<String> linkedList = new LinkedList<String>();
		populateNullsInList(linkedList);
		System.out.println("======================");

		// Vector do support entering any number of null items
		List<String> vector = new Vector<String>();
		populateNullsInList(vector);
		System.out.println("======================");
		// Stack do support entering any number of null items
		List<String> stack = new Stack<String>();
		populateNullsInList(stack);
	}

	private static void populateNullsInList(List<String> list) {
		list.add("jai shree ram");
		list.add(null);
		list.add(null);
		PrintUtility.printJoinedStream(list.stream(), list.getClass().getSimpleName() + " with null items: ");
	}

}
