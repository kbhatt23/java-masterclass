import java.lang.*;
public class SelfBinarySearch{
	public static void main(String... args){
		//has to be sorted
		int[] numbers = {0,2,4,5,6,7,8,9,14,16,19,23};
		
		int number =  (args != null && args.length >0 && args[0] != null && args[0] != "") ? Integer.parseInt(args[0]): 1;
	
		
		int index = binarySearch(numbers,number,0,numbers.length-1);
		System.out.println("index id: "+index);
	}
	
	public static int binarySearch(int[] numbers, int number , int startIndex, int endIndex){
		if(startIndex > endIndex)
			return -1;
		
				int mid = (startIndex + endIndex ) / 2;
				if(numbers[mid] == number)
					return mid;
				
				if(numbers[mid] > number)
					return binarySearch(numbers,number,startIndex,mid-1);
				else 
					return binarySearch(numbers,number,mid+1,endIndex);
		
		
	}
}