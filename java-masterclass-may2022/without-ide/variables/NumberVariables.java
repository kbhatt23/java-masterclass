import java.math.*;
public class NumberVariables{

	
	public static void main(String... args){
	//wont compile as max limit is reached as peer bits
	//byte rank = 128;
				
	byte rank = 126;

rank += 1;	

	System.out.println(rank);
	
	rank += 1;	

	//will go to minus in case max limit is reached
	System.out.println(rank);
	
	//defauolt will be double
	System.out.println(1-0.9);
	
	//BigDecimal for accuracy
	BigDecimal one = new BigDecimal("0.9");
	BigDecimal two = new BigDecimal("1");
	
	
	BigDecimal minus = two.subtract(one);
	
		System.out.println(minus.toString());
	}
}