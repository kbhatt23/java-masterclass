package concurrentcollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUsage {
	public static void main(String[] args) throws InterruptedException {
		//fail fast -> concurrnet modification excpetion
		//manipulateMultipleThreads(new HashMap<Integer, String>());
		
		manipulateMultipleThreads(new ConcurrentHashMap<>());
	}
	
	public static void manipulateMultipleThreads(Map<Integer, String> map) throws InterruptedException {
		
		Thread tWrite = new Thread(() ->  {
			int i = 1;
			while(true) {
				map.put(i, "jai shree ram");
				i++;
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		Thread tRead = new Thread(() ->{
			Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Entry<Integer, String> next = iterator.next();
				System.out.println(next.getKey());
				
			}
		});
		tWrite.start();
		Thread.sleep(50);
		tRead.start();
	}
}
