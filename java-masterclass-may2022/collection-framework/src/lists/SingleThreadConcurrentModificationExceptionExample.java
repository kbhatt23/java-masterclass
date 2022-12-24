package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SingleThreadConcurrentModificationExceptionExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("krishna");
		names.add("radha");
		names.add("fake");
		System.out.println("names " + names);
		// no concurrent modification
//
//		for (int i = 0; i < names.size(); i++) {
//			if (i == 2) {
//				names.remove(i);
//			}
//		}
//
//		System.out.println("names " + names);

		// both foreach and iterator gives exception
//		int a = 0;
//		for (String name : names) {
//			//System.out.println("validating "+name);
//			if (a == 0) {
//				names.remove(a);
//			}
//			a++;
//		}
		
		
//		int a = 0;
//		Iterator<String> iterator = names.iterator();
//		while(iterator.hasNext()) {
//			iterator.next();
//			if(a == 0) {
//				names.remove(a);
//			}
//			a++;
//		}
		System.out.println("names " + names);
	}
}
