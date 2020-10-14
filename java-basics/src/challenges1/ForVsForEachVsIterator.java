package challenges1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForVsForEachVsIterator {
public static void main(String[] args) {
	List<String> names = Arrays.asList("messi", "zidane" , "kaka" , "ronaldinho"  , "xavi", "iniesta");
	
	Iterator<String> iterator = names.iterator();
	System.out.println("first time using iterator");
	while(iterator.hasNext()) {
		System.out.println("name found "+iterator.next());
	}
	System.out.println("second time using iterator");
	while(iterator.hasNext()) {
		System.out.println("name found "+iterator.next());
	}
	
	Iterator<String> removeIterator = names.iterator();
	while(removeIterator.hasNext()) {
		String nameNxt = removeIterator.next();
		if("zidane".equals(nameNxt)) {
		//	removeIterator.remove();
		}
	}
	for(String nameNxt:names ) {
		if("zidane".equals(nameNxt)) {
			//wont work as for each also uses iterator only
		//	names.remove(nameNxt);
		}
	}
	for(int i =0 ; i<names.size();i++ ) {
		if("zidane".equals(names.get(i))) {
			//wont work as for each also uses iterator only
			//best way is to create new set of integer containing indexs and latetr on we can remove
			//names.remove(i);
		}
	}
}
}
