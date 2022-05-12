public class ExpressionRestrictions{

	
	
	public static void main(String... args){
		//expression can be int , byte short char and wrapper classes of same types
		//or string or enum
		//double number = 23d;
		//String number = "23";
		
		//wont compile now
		//Object number = new Object();
		
		//works fine
		Integer number = 23;
		number = new Integer(23);//this also works
		number = null;
		//this will give null pointer exception at runtime
		switch(number){
			
			
		}
	}
	
}