public class ForLoopBasics{

	
	
	public static void main(String... args){
		//minimalSyntax();
		//cool feature
		coolFeature();
	}
	
	static void minimalSyntax(){
		//for loop minimum signature is below
		//none of the 3 statements are mandatory
		//this will go infinite time
		
		for(; ; ){
			System.out.println("jai sita ram");
		}
	}
	
	static void coolFeature(){
		int[] numbers  = {1,3,5,7,9,11};
		
		for(int i =0  ; i < numbers.length ; System.out.println("number is "+numbers[i]), i++);
			
		
	}
	
}