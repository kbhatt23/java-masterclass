public class BitWiseExample{

	
	public static void main(String... args){
		int a = 1;  // 000001
		int b = 3;  // 000011
     

		System.out.println("a & b : "+(a & b));  // 1
		System.out.println("a | b : "+(a | b));  //3
		System.out.println("a ^ b : "+(a ^ b)); // 2
		               //   8421
			a = 3;  // 000011
		 b = 4;  //     000100
     

		System.out.println("a & b : "+(a & b));  // 0
		System.out.println("a | b : "+(a | b));  //7
		System.out.println("a ^ b : "+(a ^ b)); // 7
		
		
		
	}
	
}