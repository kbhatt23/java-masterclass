public class Factorial{

public static void main(String... args){
	int number =  (args != null && args.length >0 && args[0] != null && args[0] != "") ? Integer.parseInt(args[0]): 1;
		
		int usingForLoop = usingForLoop(number);
		int usingWhileLoop = usingWhileLoop(number);
		int usingRecursion = usingRecursion(number);
		
		System.out.println("usingForLoop: "+usingForLoop+ ",usingWhileLoop: "+usingWhileLoop+" ,usingRecursion: "+usingRecursion);
	}
	
	
	static int usingForLoop(int number){
		//0! and 1! is 1
		if(number == 0 || number == 1)
			return 1;
		int factorial=1;
		for(int i = 2 ; i <= number ; i++){
			factorial *= i;
		}
		
		return factorial;
		
	}
	
	static int usingWhileLoop(int number){
		if(number == 0 || number == 1)
			return 1;
		
		int factorial = number;
		while(number > 2){
			factorial *= number -1;
			number--;
		}
		
		return factorial;
	}
	
	static int usingRecursion(int number){
		if(number == 0 || number == 1)
			return 1;
		
		return number * usingRecursion(number-1);
	}

}