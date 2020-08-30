package arraylist;

import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class LinkedListPriorityQueue {
public static void main(String[] args) {
	PriorityQueue<String> prioertiyQueue = new PriorityQueue<>();
	prioertiyQueue.add("lapela");
	prioertiyQueue.add("apple");
	prioertiyQueue.add("apple");
	prioertiyQueue.add("abs");
	System.out.println(prioertiyQueue.peek());
	Iterator<String> iterator = prioertiyQueue.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
