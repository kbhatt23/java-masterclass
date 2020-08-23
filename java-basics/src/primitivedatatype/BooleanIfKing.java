package primitivedatatype;

public class BooleanIfKing {
public static void main(String[] args) {
	boolean cond = true;
	//= condition actually return the value added
	if(cond = true) {
		System.out.println("jai shree ram");
	}
	System.out.println("after first oepration "+cond);
	if(cond = false) {
		System.out.println("jai fake god");
	}
	System.out.println("after second oepration "+cond);
	
	//bad thing
	boolean isAlien = true;
	//if(isAlien == false);
		//	System.out.println("ALien is calling jai shree ram");
			//System.out.println("kannu is alsoi saying jai shree ram");
	if(isAlien == false)
		System.out.println("ALien is calling jai shree ram");
		System.out.println("kannu is also saying jai shree ram");
		
}
}
