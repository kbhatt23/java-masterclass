public class ObjectReference{
	
	//this assigns null value as it is field of class level
			//static ObjectReference obj;

public static void main(String... args){
		// no defalt value assigned for any local variable
		//hence below wont compile
				//ObjectReference obj;
ObjectReference obj = null;
		
		obj.hello();
}

public void hello(){
	System.out.print("jai radha madhav");
}
}