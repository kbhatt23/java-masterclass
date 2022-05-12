public class ArithematicOperations{

	
	public static void main(String... args){
		
	
		//charAddition();
		//prePostIncrement();
		
		operatorPrecedence();
	}
	
	static void operatorPrecedence(){
		
		System.out.println(2+3-1*22/3.0);
		
		//2 + 3 - (1 * 22) /3.0;
		//2 + 3 - (22/3.0)
		//2+ 3 - 7.33
		//5 - 7.33
		//-2.33
		
	}
	
	static void prePostIncrement(){
		//post increment means first current line is exceuted and then value is updated before next statement is executed
		
		int a = 23;
		
		int b = a++;
		System.out.println("a:" + a+",b:"+b);
		
		 a = 23;
		
		 b = ++a;
		System.out.println("a:" + a+",b:"+b);
	}

	static void charAddition(){
		//equivalent to char c = 97
		char c = 97;
		//char c = 'a';
		
		//will show the int value
		//System.out.println((int)c);
		
		//char a = 117;
		//System.out.println(a);
		
		//char is first converted to int 97
		//97+20 = 117 auto added to int here
		System.out.println(c + 20);
		
	}

}