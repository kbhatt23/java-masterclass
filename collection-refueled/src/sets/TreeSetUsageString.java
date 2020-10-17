package sets;

import java.util.NavigableSet;
import java.util.TreeSet;

import common.CollectionUtils;

public class TreeSetUsageString {
public static void main(String[] args) {
	NavigableSet<String> navigableSet = new TreeSet<String>();
	navigableSet.addAll(CollectionUtils.fetchStringArrayList());
	
	System.out.println(navigableSet);
	//duplication check based on comparable comare to method and not equals
	navigableSet.add("madhav");
	System.out.println(navigableSet);
	
}
}
