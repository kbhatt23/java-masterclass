package switchexpressions;

public class BasicSwitchExpression {
	public static void main(String[] args) {
		int input = 200;
		System.out.println("usingSwitchCase: "+usingSwitchCase(input));
		System.out.println("usingSwitchExpression: "+usingSwitchExpression(input));
		
	}
	private static String usingSwitchExpression(int input) {
		String result =
		switch(input) {
		case 100 -> {
			//can write some computation
			compute();
			yield "one";
		}
		//common code for 200 and 300 value
		case 200 , 300 -> 
		{
			//can write some computation
			compute();
			yield "three";
		}
		case 400 ->  "four";
		
		default -> throw new IllegalArgumentException("invalid input passed: "+input);
		};
		return result;
	}


	private static String usingSwitchCase(int input) {
		String result = null;
		switch(input) {
		case 100 : {
			//can write some computation
			compute();
			result = "one";
			break;
		}
		//common code for 200 and 300 value
		case 200: 
		case 300 : {
			//can write some computation
			compute();
			result = "three";
			break;
		}
		case 400: result= "four"; break;
		
		default : throw new IllegalArgumentException("invalid input passed: "+input);
		}
		return result;
	}

	private static void compute() {
		
	}
}
