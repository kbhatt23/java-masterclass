package queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SelfQueueDemo {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		
		//stack usage: in same we can manually and forcefully add/remove based on specific code
		
		//belos is tack use
		
		deque.push(10);
		deque.push(3);
		
		deque.push(6);
		deque.push(3);
		deque.push(null);
		deque.push(-1);
		
		System.out.println(deque.size());
		System.out.println(deque.peek());
		System.out.println(deque.peek());
		
		while(deque.size() > 0) {
			System.out.println("data : "+deque.pop());
		}
	}
}
