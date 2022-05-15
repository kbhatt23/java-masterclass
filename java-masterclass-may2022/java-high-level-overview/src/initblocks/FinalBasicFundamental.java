package initblocks;

public class FinalBasicFundamental {

	public static void main(String[] args) {
		
		//Integer.valueOf("sita ram");
		//final variable means its value can not be reassigned
		
		//primitive 
		final int id = 123;
		
		//compiler cries on reassignement
		//id=124;
		
		final boolean success = true;
		
		//again cries
		//success = false;
		
		//String also can not be reassigned
		final String name = "kanishk";
		
		//name="fake";
		
		final Integer waID =99;
		//wont work
		//waID =100;
		
		//for object we can not update reference to new object
		//but fields can be modified
		final FinalBasicFundamental obj = new FinalBasicFundamental();
		
		//reinitalizeing reference not possible
		//obj = new FinalBasicFundamental();
		
		obj.variable = 99;
		System.out.println(obj.variable);
	}
	
	public int variable;
}
