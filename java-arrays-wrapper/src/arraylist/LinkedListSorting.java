package arraylist;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListSorting {
public static void main(String[] args) {
	List<String> listItems = new LinkedList<String>();
	listItems.add("ram");
	listItems.add("hanuman");
	listItems.add("keshav");
	printItems(listItems);
	listItems.add(1, "mahadev");
	System.out.println("============");
	printItems(listItems);
	
	System.out.println("===========sorting wala =================");
	
	listItems = new LinkedList<String>();
	insertSortedMAnner(listItems, "lapela");
	insertSortedMAnner(listItems, "apple");
	insertSortedMAnner(listItems, "apple");
	insertSortedMAnner(listItems, "abs");
	printItems(listItems);
	
	System.out.println("=============listiterawtore wlaa======");

	listItems = new LinkedList<String>();
	insertSortedUsingiterator(listItems, "lapela");
	insertSortedUsingiterator(listItems, "apple");
	insertSortedUsingiterator(listItems, "apple");
	insertSortedUsingiterator(listItems, "abs");
	printItems(listItems);
}

private static void insertSortedMAnner(List<String> listItems , String newItem) {
	for(int i =0 ; i < listItems.size() ; i++) {
		String currentItem = listItems.get(i);
		if(newItem.compareTo(currentItem) < 0) {
			listItems.add(i,newItem);
			return;
		}
	}
	listItems.add(newItem);
}

private static void insertSortedUsingiterator(List<String> listItems , String newItem) {
	ListIterator<String> listIterator = listItems.listIterator();
	while(listIterator.hasNext()) {
		String current = listIterator.next();
		if(newItem.compareTo(current) < 0) {
			listIterator.previous();
			listIterator.add(newItem);
			return;
		}
	}
	listIterator.add(newItem);
}
private static void printItems(List<String> listItems) {
	Iterator<String> iterator = listItems.iterator();
	while(iterator.hasNext()) {
		System.out.println("Found item "+iterator.next());
	}
}
}
