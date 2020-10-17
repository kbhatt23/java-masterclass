package arrays;

import java.util.Arrays;

import common.PrintUtility;

public class InitialzieAndInstantiateTogether {
public static void main(String[] args) {
	int[] a;
	
	//not posisle
	//a = {1,2,3,4};

	//using anonymous array we need to declare instiatlize and instatiate all togehter
	
	a = new int[2];
	int[] b = {1,2};
	
	int[][] two = {{1,2},{3}};
	
	PrintUtility.printJoinedStream(Arrays.stream(a).boxed(), "");
	PrintUtility.printJoinedStream(Arrays.stream(b).boxed(), "");
	for(int[] one: two) {
		PrintUtility.printJoinedStream(Arrays.stream(one).boxed(), "");
	}
	System.out.println("========special===========");
	int[][] special = new int[2][2];
	//main array will have size 2, and each 0 and 1 index have array of size 2
	special[0][0] = 23;
	special[0][1] = 24;
	special[1][0] = 25;
	special[1][1] = 26;
	
	for(int[] one: special) {
		PrintUtility.printJoinedStream(Arrays.stream(one).boxed(), "");
	}
	
	
}
}
