package concurrentcollections;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class WhyToUseConcurrentCollections {
public static void main(String[] args) {
	//Collection<String> set = new ArrayList<String>();
	Collection<String> set = new CopyOnWriteArrayList<String>();
	Thread tWrite = new Thread(() -> {
		while(true) {
			set.add("23");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	
	Thread tRead = new Thread(() -> {
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	tWrite.start();
	tRead.start();
}
}
