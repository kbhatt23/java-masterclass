package garbagecollectors;

public class EpsilonGCDemo {
	public static void main(String[] args) {
		byte[] bytes = new byte[1024];
		
		for(int i = 0 ; i < Integer.MAX_VALUE ; i++) {
			//after every iteration the byte array object is free for g.c
			//if epsilon gc is enabled it wont free up and will have eventual out of memory error
			bytes = new byte[1023];
		}
		
		System.out.println("Task Completed final bytes: "+bytes);
	}
}
