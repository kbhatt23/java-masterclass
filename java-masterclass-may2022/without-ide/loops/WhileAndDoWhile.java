public class WhileAndDoWhile{

	
	
	public static void main(String... args){
		whileExample();
		doWhileExample();
	}
	
	static void whileExample(){
		//no initailzation specific to block
		//no ending statment block -> need to add inside code block
		
		//print numbers from 1 to 9
		int number = 1;
		
		//give postive case when block shluld be exceuted otherwise it goes out
		while(number < 10){
			System.out.println("number is: "+number);
			number++;
		}
		
		
		
		
	}
	
	static void doWhileExample(){
		//first time code block executes
		//from second time condition is checked and if true goes inside block or else comes out of block
		//int number = 1;
		
		int number = 10;
		do{
			System.out.println("number is: "+number++);
			
		}while(number < 10);
	}
	
}