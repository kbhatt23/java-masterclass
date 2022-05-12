public class FindDivisors{

	
	
	public static void main(String... args){
		int number = 24;
		
		//divisor starts from 1 and end at 24
		//we know that number/2 should be the max it can divide
		for(int current = 1 , end = number >>> 1; current <=  end ; current++){
			if(number % current == 0)
				System.out.println("divisor is "+current);
		}
		System.out.println("divisor is "+number);
		
	}
	
	
	
}