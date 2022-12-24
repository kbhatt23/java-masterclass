package queues;

import java.util.LinkedList;
import java.util.Queue;

public class SelfDequeueDemo {

	public static void main(String[] args) {
		//Linkedlist can be used for queue,deque and list 
		//linked lit implements both list, and deque(deque extends queue)
		
		Queue<Integer> queue = new LinkedList<>();
//		queue.offer(null);
//		queue.offer(4);
//		queue.offer(null);
//		queue.offer(4);
//		queue.offer(47);
		
		System.out.println(queue);

		int size = queue.size();
		System.out.println(size);
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		for(int i = 0 ; i < size ; i++) {
			System.out.println("queue data: "+queue.poll());
		}
	}
}
