package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovingWhileITeratingcollection {
	public static void main(String[] args) {
		//any viewd collection wont work while iterating we cna not remove element
		//List<String> strings = populateListUsingArrays();
		
		//fixed size array can not increase the size or decrease -> hence we can not remove or add item in viewed list
		//strings.add("f");
		//strings.remove("c");
		
		//we can still remove while iterating using any loop
		List<String> strings = populateListManually();

		// iteration order will be same as insertion order
		// as far as i know until we are tieration we can not revmoe list item , using
		// any technique
		// throws unsupported operation exception

		//clearITemUsingFor(strings);

		//clearItemUsingForEach(strings);

		clearITemUsingIterator(strings);

		printITemsUsingIterator(strings);
	}

	private static List<String> populateListUsingArrays() {
		List<String> strings = Arrays.asList("a","b","c","d");
		return strings;
	}

	private static List<String> populateListManually() {
		List<String> strings = new ArrayList<String>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		return strings;
	}

	private static void printITemsUsingIterator(List<String> strings) {
		Iterator<String> iterator1 = strings.iterator();
		while (iterator1.hasNext()) {
			String entry = iterator1.next();
			System.out.println("again iterator element " + entry);
		}
	}

	private static void clearITemUsingIterator(List<String> strings) {
		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext()) {
			String entry = iterator.next();
			System.out.println("iterator element " + entry);
			if (entry.equals("c")) {
				iterator.remove();
			}
		}
		//for Viewed collection use below method to remove item, keep it outsied the iteration
				//strings.removeAll(c);
				//strings.removeIf(filter);
	}

	private static void clearItemUsingForEach(List<String> strings) {
		for (String a : strings) {
			System.out.println("itearting entry " + a);
			if (a.equals("c")) {
				strings.remove(a);
			}
		}
	}

	private static void clearITemUsingFor(List<String> strings) {
		for (int i = 0; i < strings.size(); i++) {
			System.out.println("itearting entry " + strings.get(i));
			if (strings.get(i).equals("c")) {
				strings.remove(i);
			}
		}
	}
}
