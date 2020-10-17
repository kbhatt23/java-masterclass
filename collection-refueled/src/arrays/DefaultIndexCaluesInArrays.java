package arrays;

import java.util.Arrays;

import common.PrintUtility;

public class DefaultIndexCaluesInArrays {
public static void main(String[] args) {
	int[] nums = new int[5];
	//default will 0 at each index
	PrintUtility.printJoinedStream(Arrays.stream(nums).boxed(), "Default initiated array of type "+nums.getClass().getName()+" with values: ");
	
	//default will null at each index
	String[] strings = new String[5];
	PrintUtility.printJoinedStream(Arrays.stream(strings), "Default initiated array of type "+strings.getClass().getName()+ " with values: ");
}
}
