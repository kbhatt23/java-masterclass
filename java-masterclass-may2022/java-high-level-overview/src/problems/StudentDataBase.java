package problems;

import java.util.concurrent.ThreadLocalRandom;

public class StudentDataBase {
	public static int[][] studentMarks(){
		//minimum row size is mandatory
		//but since all students have same subject we are keeping column also in initialization
		int[][] studentMarks = new int[5][5];
		
		for(int i = 0 ; i < studentMarks.length ; i++) {
			for(int j = 0 ; j <studentMarks[i].length ; j++) {
				studentMarks[i][j]  = ThreadLocalRandom.current().nextInt(50, 101);
			}
		}
		
		return studentMarks;
		
	}
	
	public static void print(int[][] items , String itemName) {
		if(items == null || items.length == 0)
			return;
		for(int i = 0 ; i < items.length ; i++) {
			for(int j = 0 ; j <items[i].length ; j++) {
				System.out.print(itemName +":"+ items[i][j]);
				//except last element
				if( j < (items[i].length - 1))
					System.out.print(",");
			}
			System.out.println("------------------------");
		}
	}
}
