package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueUsage {
	public static void main(String[] args) {
		//String implments comparable and hence no issue
		Queue<String> queue = new PriorityQueue<String>();
		//offer to heapify items
		queue.offer("ram");
		queue.offer("raghav");
		queue.offer("sita");
		queue.offer("lakshmi");
		queue.offer("narayan");
		
		System.out.println("queue peek : "+queue.peek());
		System.out.println("queue poll "+queue.poll());
		System.out.println("queue peek : "+queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}
}
