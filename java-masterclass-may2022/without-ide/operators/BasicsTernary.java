import java.lang.*;
public class BasicsTernary{

	
	
	public static void main(String... args){
		boolean dataExists = args != null && args.length > 0 && args[0] != null  && !args[0].isEmpty();
		int age = dataExists ? Integer.parseInt(args[0]): -10 ;
		
	//basic(age);
		
wrongTernary();
		}
		
		static void wrongTernary(){
			
			//in ternary the methods/expression must returna  valye not void otherwise compiler wont be happy
			//also value mus be assigned to variable
			int ka = true ? tCase() : fCase();
		}
		
		
		
		static void basic(int age){
				
				
		
		int result = age > 10 ? trueCase(): falseCase();
		
		System.out.println("final result: "+result);
		}
	
	static int trueCase(){
		System.out.println("truecase called");
		return 10;
	}
	
	static int falseCase(){
		System.out.println("falseCase called");
		return -10;
	}
	
		
	static int tCase(){
		System.out.println("tCase called");
		return 100;
	}
	
	static int fCase(){
		System.out.println("fCase called");
		return -100;
	}
	
}