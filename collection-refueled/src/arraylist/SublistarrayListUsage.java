package arraylist;

import java.util.List;

import common.CollectionUtils;

public class SublistarrayListUsage {
public static void main(String[] args) {
	//accoording to me it copules both the items
	
	List<String> fetchStringArrayList = CollectionUtils.fetchStringArrayList();
	//shud take 0,1 and 2 only just like substring and subset and other mapped collections
	List<String> subList = fetchStringArrayList.subList(0, 3);
	
	System.out.println("main list "+fetchStringArrayList);
	System.out.println("subList list "+subList);
	
	subList.add("jai sita ram");
	
	System.out.println("after modification main list "+fetchStringArrayList);
	System.out.println("after modification  subList list "+subList);
}
}
