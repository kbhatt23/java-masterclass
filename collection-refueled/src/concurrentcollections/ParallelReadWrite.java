package concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParallelReadWrite {
	public static void main(String[] args) throws InterruptedException {
		List<String> arrayList = new ArrayList<String>();
		//List<String> arrayList = new CopyOnWriteArrayList<String>();
		Thread t1 = new Thread(() -> {
			while(true) {
				arrayList.add("23");
				try {
					Thread.sleep(100);	
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		
		Thread t2 = new Thread(() -> {
			Iterator<String> iterator = arrayList.iterator();
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
		t2.start();
		
		
	}
}
