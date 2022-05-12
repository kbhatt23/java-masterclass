public class ReverseArrayAdvanced{

	
	
	public static void main(String... args){
		int[] numbers = {0,1,2,3,4,5,6,7,8,9};
		
		printArray(numbers);
		
		//for(int i = 0 , j = numbers.length - 1 ; i < numbers.length /2 ; i++,j--){
		//further optimization as for huge amount of data /2 operation is happening that many times but it is static
		//for(int i = 0 , j = numbers.length - 1, mid= numbers.length / 2 ; i < numbers.length /2 ; i++,j--){
			
			//even better >>> 1 means /2
			
		for(int i = 0 , j = numbers.length - 1, mid= numbers.length >>> 1 ; i < numbers.length /2 ; i++,j--){
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		System.out.println();
		printArray(numbers);
		
	}
	
	static void printArray(int[] numbers){
		
		for(int i = 0 ; i < numbers.length ; System.out.println("number is "+numbers[i]),i++);
			
		
	}
	
	
	
}