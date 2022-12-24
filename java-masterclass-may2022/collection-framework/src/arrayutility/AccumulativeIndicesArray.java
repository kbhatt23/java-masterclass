package arrayutility;

import java.util.Arrays;

public class AccumulativeIndicesArray {

	public static void main(String[] args) {
		int[] numbers= {2,1,0,3};
		
		int[] accumulate = accumulate(numbers);
		
		System.out.println(Arrays.toString(accumulate));
		System.out.println(Arrays.toString(numbers));
	}
	
	public static int[] accumulate(int[] numbers) {
		if(numbers == null || numbers.length == 0)
			return numbers;
		
		int length = numbers.length;
		int[] response = new int[length];
		
		int sum = 0;
		for(int i = 0 ; i < length ; i++) {
			int temp = numbers[i];
			response[i] = numbers[i] + sum;
			sum+=temp;
		}
			
		return response;
		
	}
}
