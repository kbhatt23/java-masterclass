package linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAsQueue {
public static void main(String[] args) {
	//dequeu have double ended queue methods
	Deque<String> linkedList = new LinkedList<String>();
	
	//queue have offer and pop and peek
	linkedList.offer("sita ram");
	linkedList.offer("radhe shyam");
	System.out.println("size "+linkedList.size());
	
	System.out.println("queue top "+linkedList.peek());
	System.out.println("remoing item at queue top "+linkedList.pop());
	System.out.println("queueu top "+linkedList.peek());
	System.out.println("final size "+linkedList.size());
	
}
}
