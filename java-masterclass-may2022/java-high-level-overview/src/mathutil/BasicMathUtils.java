package mathutil;

public class BasicMathUtils {
	//if we create a constructor private except this class no one can instantiate it
	
	private BasicMathUtils() {}
	public static void main(String[] args) {

		//same class and hence can create object
		BasicMathUtils obj = new BasicMathUtils();
		
		obj.mathUtils();
	}
	private void mathUtils() {
		//genrate random no b/w 1-100 inclusive
		int random = generateRandomNumber(1,100);
		System.out.println("random number generated "+random);
		
		System.out.println();
		
		//absolute meaning take positive of negative as well
		System.out.println("double abs :"+Math.abs(-22.33));
		
		System.out.println("int abs :"+Math.abs(-99));
		
		System.out.println();
		
		//round off
		double dNumber = 22.5;
		//if we type cast to int it is always floor means skip everything after .
		System.out.println("type case is "+(int)dNumber+", floor is "+Math.floor(dNumber));
		
		System.out.println("ceil is "+Math.ceil(dNumber));
		
		//round is logical based on. val
		
		System.out.println("round is "+Math.round(dNumber));
		
	}
	private int generateRandomNumber(int low, int high) {
		
		// [0,1) : 0.0 as min and 0.99 as max
		double random = Math.random();
		
		return ((int)(random * high)) + low;
	}

}
