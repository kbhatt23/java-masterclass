package arraylist;

import java.util.Iterator;
import java.util.List;

import common.CollectionUtils;

public class ArrayListAllMethods {
public static void main(String[] args) {
	//default size is 10, in case u ahve a lot of items minim count use that size , os taht less chance of resizing
	List<String> strings = CollectionUtils.fetchStringArrayList();
	
	//since it is viewed collection-> we can do things on list that an array can do
	//meaning we can not add a new item or remove as array size can not be modified, however we can modify the indexes
	

	System.out.println("size "+strings.size());
	
	System.out.println("first item "+strings.get(0));
	
	//set any index
	strings.set(3, "shyam lal");
	System.out.println("modified item "+strings.get(3));
	
	strings.remove(3);
	System.out.println("after remove "+strings.get(3));
	
	strings.removeIf(a -> a.length() == 6);
	System.out.println("size after bulk removal "+strings.size());
	System.out.println("=============iteration===========");
	Iterator<String> iterator = strings.iterator();
	while(iterator.hasNext()) {
		System.out.println("Iterating item "+iterator.next());
	}
	System.out.println("=============iteration===========");
	//shud return false
	System.out.println("contains item hanuman "+strings.contains("hanuman"));
	System.out.println("contains item ramduta hanuman "+strings.contains("ramduta hanuman"));
}

}
