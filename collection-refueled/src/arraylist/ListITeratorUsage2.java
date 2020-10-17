package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListITeratorUsage2 {
public static void main(String[] args) {
	List<String> strings = new ArrayList<String>();
	strings.add("messi");
	strings.add("xavi");
	strings.add("iniesta");
	strings.add("puyol");
	strings.add("carlito");
	
	//listiterator can traverse in both direction
	//listierator allows add and update method
	//in noraml iterator we can iterate in one direction and can remove item thats it
	ListIterator<String> listIterator = strings.listIterator();
	System.out.println(strings);
	while(listIterator.hasNext()) {
		String element = listIterator.next();
		if(element.equals("puyol")) {
			listIterator.add("pique");
		}
		if(element.equals("carlito")) {
			listIterator.remove();
		}
		if(element.equals("xavi")) {
			listIterator.set("Xavi Hernandez");
		}
	}
	System.out.println(strings);
} 

}
