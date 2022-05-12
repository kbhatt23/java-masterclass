public class PreAndPostIncrement{

	
	public static void main(String... args){
		
		int l = 'a';
		System.out.println(":"+l);
		
		int x =2;
		
		//value of x will increment after this line
		//hence current x is assigned to whihc is 2 and after this line x becomes 3
		
		int y = x++;
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		
		
		 x =2;
		
		//value of x will increment after this line
		//hence current x is assigned to whihc is 2 and after this line x becomes 3
		
		 y = ++x;
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		
		
		
	}


}