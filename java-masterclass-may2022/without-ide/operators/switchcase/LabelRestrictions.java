public class LabelRestrictions{

	
	
	public static void main(String... args){
		//label value should be within range of expresion data type
		//label should be constant at compile time
		//label can not be duplicate
		
		//byte is auto cast to int and hence works fine
		byte number = 1;
		final byte another = 1;
		switch(number){
			//number is byte and hence labels should be within the range -128-127
			//all the label values should be constant
			//case 1: System.out.println("jai shree ram");
			//wont wiork until it si final at static at compile time
			case another: System.out.println("jai shree ram");
			break;
			
			//duplicate wont work
			//case another: System.out.println("jai shree ram");
			//break;
			
			case 2: System.out.println("jai radha madhav");
			break;
			
			//outside the range of byte and hence wont compile
			//case 128: System.out.println("outside the range");
			//now it works
			case 127: System.out.println("outside the range");
			break;
		}
		
	}
	
}