package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListVsArrayList {
public static void main(String[] args) {
	List<Integer> arrayList  = new ArrayList<Integer>();
	for(int i = 0 ; i < 5 ; i ++) {
		arrayList.add(i);
	}
	List<Integer> linkedList  = new LinkedList<Integer>();
	for(int i = 0 ; i < 5 ; i ++) {
		linkedList.add(i);
	}
	iterateItems(arrayList);
	System.out.println("=========================");
	iterateItems(linkedList);

}

public static void iterateItems(List<Integer> items) {
	ListIterator<Integer> listIterator = items.listIterator();
	while(listIterator.hasNext()) {
		System.out.println("item found "+listIterator.next());
	}
}
}
