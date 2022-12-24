package arrayutility;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
	public static void main(String[] args) {
		//constructor is private
		//to force use static method only in static way
		//Arrays arrays = new Arrays();
		
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 11;
		a[2] = 14;
		a[3] = 10;
		
		//it will consider single items index as array
		//so 2d arraylist
		//List<Integer> aList =  Arrays.asList(a);
		
		List<int[]> aList =  Arrays.asList(a);
		for(int[] inner : aList) {
			for(int b : inner) {
				System.out.println(b);
			}
			System.out.println("====================");
		}
		
		//IT creates fixed size arraylist
		//meaning we can not add any new element nor remove
		//throws unsupportedoperationexception
		//however if we update specific index in list it reflects in array as well
	    //also modifying in array will reflect the same in arraylist
		
		String[] narayanArray = new String[] {"sita ram", "radhe shyam"};
		List<String> narayanList = Arrays.asList(narayanArray);
		
		//narayanList.add("fake");
		//narayanList.remove(0);
		
		narayanArray[0] = "Sita Rama";
		narayanList.set(1, "Radhe Shyam");
		
		System.out.println(narayanList);
		//System.out.print("[");
//		for(String k  : narayanArray) {
//			System.out.print(k);
//			System.out.print(",");
//		}
//		System.out.println("]");
		
		System.out.println(toString(new String[] {"one", "two","three", "four"}));
		
		System.out.println(Arrays.toString(narayanArray));
	}
	
	private static String toString(String[] input) {
		if(input == null)
			return "null";
		
		int length = input.length;
		if(length <= 0)
			return "[]";
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0 ; i < length ; i++) {
			sb.append(input[i]);
			if(i < (length -1))
				sb.append(", ");
		}
		sb.append("]");
		
		return sb.toString();
	}
}
