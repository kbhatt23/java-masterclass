package arraylist;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import common.CollectionUtils;

public class ListIteratorUsage {
	public static void main(String[] args) {
		List<String> fetchStringArrayList = CollectionUtils.fetchStringArrayList();
		Iterator<String> iterator = fetchStringArrayList.iterator();
		System.out.println("All items in list initially");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" , ");
		}
		
		ListIterator<String> listIterator = fetchStringArrayList.listIterator();
		//lets have item only after pyarelal
		while(listIterator.hasNext()) {
			String val = listIterator.next();
			if(val.equals("pyarelal")) {
				listIterator.remove();
				while(listIterator.hasPrevious()) {
					listIterator.previous();
					listIterator.remove();
				}
			}
		}
		System.out.println("");
		System.out.println("items after removal "+fetchStringArrayList);
	}
}
