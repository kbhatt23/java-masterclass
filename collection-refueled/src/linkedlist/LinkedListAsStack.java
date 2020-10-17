package linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAsStack {
public static void main(String[] args) {
	//dequeu have double ended queue methods
	Deque<String> linkedList = new LinkedList<String>();
	
	//stack push and pop and peek
	linkedList.push("sita ram");
	linkedList.push("radhe shyam");
	System.out.println("size "+linkedList.size());
	
	System.out.println("stack top "+linkedList.peek());
	System.out.println("remoing item at stack top "+linkedList.pop());
	System.out.println("stack top "+linkedList.peek());
	System.out.println("final size "+linkedList.size());
	
}
}
