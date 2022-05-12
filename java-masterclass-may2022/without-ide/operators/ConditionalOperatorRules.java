public class ConditionalOperatorRules{

	
	public static void main(String... args){
		//conditional operators are applicable only to primitive ints only
		//eg > < 
		//these 4 are not applicable to boolean and objects
		
		boolean independent = true;
		
		//wont compile, operator > not appicable for boolean and objects
		/*if(independent > false){
			System.out.println("independent is greater");
		}*/
		
		Object o1 = new Object();
		Object o2 = new Object();
		//wont compiler
		//operator > not applicable for operand object and booleans
		/*if(o1 > o2){
			System.out.println("o1 is greater");
		}else{
			
			System.out.println("o2 is greater");
		}*/
		
	}
	
}