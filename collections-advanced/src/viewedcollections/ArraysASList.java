package viewedcollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import common.PrintUtility;

public class ArraysASList {
	public static void main(String[] args) {
		Integer[] numberArray = new Integer[] {1,2,3,4,5,6};
		List<Integer> numberList = Arrays.asList(numberArray);
		//it returns fied size array view -> hence can not add anything new to list as array size wont grow
		
		PrintUtility.printJoinedStream(numberList.stream(), "initial list numbers are ");
		PrintUtility.printJoinedStream(Arrays.stream(numberArray), "initial array numbers are ");
		
		
		//unsupportedOperation exception
		//numberList.add(23);
		
		//however we can modiy the item at any index and it will show up in both list and array
		numberList.set(2, 23);
		//array cahnge also will be visible to list
		numberArray[0] = 99;
		
		//moved to utility class
		//System.out.println(numberList.stream().map(String::valueOf).collect(Collectors.joining(",")));
		//System.out.println(Arrays.stream(numberArray).map(String::valueOf).collect(Collectors.joining(",")));
		PrintUtility.printJoinedStream(numberList.stream(), "list numbers are ");
		PrintUtility.printJoinedStream(Arrays.stream(numberArray), "array numbers are ");
		
		
	}
}
