//var arg is illusion
//actually method param remains fixefd just like last parameter is automatically an array
// in method invocation we can pass 0-n argument corresponding to the parameter , hence name vararg and not varparam

public class VarArgsExample{
	
		//can take array of 0-n size
		//if no argument passed array size is 0
		static void print(int... items){
				for(int n : items){
				System.out.println("arg found: "+n);
				}
				System.out.println("print completed");
				
			
		}
		
		static void print(boolean status , int... items){
				for(int n : items){
				System.out.println("success arg found: "+n);
				}
				System.out.println("success print completed");
				
			
		}
		
		
		public static void main(String... args){
		
			//print(1,2);
			print(true,new int[]{3,5,3,2});
			
		}
	
	}