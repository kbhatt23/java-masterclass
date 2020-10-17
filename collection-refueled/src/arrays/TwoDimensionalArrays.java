package arrays;

import java.util.Arrays;

import common.PrintUtility;

public class TwoDimensionalArrays {
public static void main(String[] args) {
	//this will create one array obvject of size 3, each index will itself will be one d array holding int in idividual index
	//however this will create one array will indexex linked to null
	int[][] twoD = new int[3][];
	
	System.out.println("twod size "+twoD.length);
	//null,null,null -> as each indx have null refrerence
	PrintUtility.printJoinedStream(Arrays.stream(twoD), "intial printing twod array: ");

	//lets initalze first otherwie will geive null pointer
	
	for(int i =0 ; i< twoD.length;i++) {
		twoD[i] = new int[2];
	}
	
	//here null pointer excpetion should come
	//as twoD{0} is null
	int current = twoD[0][0];
	twoD[0][0] = current+10;
	
	PrintUtility.printJoinedStream(Arrays.stream(twoD), "final printing twod array: ");
}
}
