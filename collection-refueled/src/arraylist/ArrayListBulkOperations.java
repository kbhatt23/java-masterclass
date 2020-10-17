package arraylist;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import common.CollectionUtils;

public class ArrayListBulkOperations {
public static void main(String[] args) {
	List<String> strings = CollectionUtils.fetchStringArrayList();
	//all bulk oepartions have collection as input and not just like or set or queue
	strings.addAll(CollectionUtils.fetchRandomSet());
	System.out.println("=====Printing after add all============");
	
	Iterator<String> iterator = strings.iterator();
	while(iterator.hasNext()) {
		System.out.println("item found "+iterator.next());
	}
	System.out.println("=====Printing after add all============");
	
	//removeall -> remove all the items that are common from main calling array 
	//basically this undoe above addalloperation
	strings.removeAll(CollectionUtils.fetchRandomSet());
	
System.out.println("=====Printing after remove all============");
	
	Iterator<String> iterator1 = strings.iterator();
	while(iterator1.hasNext()) {
		System.out.println("item found "+iterator1.next());
	}
	System.out.println("=====Printing after remove all============");
	
	
	strings.addAll(CollectionUtils.fetchRandomSet());
	//if all the collection items is present in string then return true potherwise false
	System.out.println("should return true "+strings.containsAll(CollectionUtils.fetchRandomSet()));
	
	System.out.println("should return false "+CollectionUtils.fetchRandomSet().containsAll(strings));
	
	//retain all
	//intersection- >retainall keeps items whihc are present in amin calling array , others are removed
	Set<String> fetchRandomSet = CollectionUtils.fetchRandomSet();
	fetchRandomSet.retainAll(strings);
	//no effect on set -> same items
	System.out.println("retain all claled in set makes no effect "+fetchRandomSet);
	System.out.println("size before arraylist retain all "+strings.size());
	strings.retainAll(fetchRandomSet);
	System.out.println("reatin all called in arraylist, items other than present in set will get removed from arraylist ");
	System.out.println(strings);
	
}
}
