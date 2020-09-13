package concurrency;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModifcationExeptioScenario {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("kaka", "messi", "zidane", "ronaldinho", "iniesta", "xavi");

		Iterator<String> iterator = items.iterator();
		Iterator<String> iterator99=iterator;
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals("zidane")) {
			//	System.out.println("removing item");
				//iterator.remove();
				
			}
			System.out.println("type 1 "+next);
		}
		while (iterator99.hasNext()) {
			String next = iterator99.next();
			if (next.equals("zidane")) {
			//	System.out.println("removing item");
				//iterator.remove();
				
			}
			System.out.println("type 2 "+next);
		}

		Iterator<String> iterator1 = items.listIterator();
		while (iterator1.hasNext()) {
			String next = iterator.next();
			if (next.equals("zidane")) {
				System.out.println("removing item");
				iterator.remove();
			}
		}
		
		Iterator<String> iterator2 = items.listIterator();
		while (iterator2.hasNext()) {
			String next = iterator.next();
				System.out.println("item found "+next);
			}
		}

}
