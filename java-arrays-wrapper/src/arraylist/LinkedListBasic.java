package arraylist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasic {
public static void main(String[] args) {
	//deque interface adds double ended que -> can b eused both for stakc and queue
	Deque<String> stackName = new LinkedList<String>();
	stackName.push("ram");
	stackName.push("hanuman");
	stackName.push("keshav");
	
	System.out.println(stackName.peek());
	System.out.println(stackName.peek());
	System.out.println(stackName.pop());
	System.out.println(stackName.peek());
	System.out.println("=====queuue starts======");
	Deque<String> queueName = new LinkedList<String>();
	queueName.offer("ram");
	queueName.offer("hanuman");
	queueName.offer("keshav");
	System.out.println(queueName.peek());
	System.out.println(queueName.poll());
	System.out.println(queueName.peek());
}
}
