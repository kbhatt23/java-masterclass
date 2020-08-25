package challenges1;

public class BarkingDog {

	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true, 0));
	}

	public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay){
	     boolean shouldWakeUp = false;
		 if(isDogBarking && hourOfDay>=0 && hourOfDay <= 23 && (hourOfDay < 8 || hourOfDay > 22)) {
			 shouldWakeUp = true;
	     }
		 return shouldWakeUp
				 ;
	 }

}
