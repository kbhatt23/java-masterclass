package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindNLargestNumbersInArray {
	
	public static void main(String[] args) {
		int[] items = {4,6,1,7,6,2};
		int[] findnLargestNumbers = findnLargestNumbers(items, 4);
		Arrays.stream(findnLargestNumbers)
		   .forEach(number -> System.out.println(number));
	}

	public static int[] findnLargestNumbers(int[] items, int size) {
		int[] largestItems = new int[size];
		
		Queue<Integer> priorityQueue = new PriorityQueue<>(size, Comparator.reverseOrder());
		for(int item : items) {
			priorityQueue.offer(item);
		}
		
		for(int i = 0 ; i < size ; i++) {
			largestItems[i] = priorityQueue.poll();
		}
		
		return largestItems;
	}
}
