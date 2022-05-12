public class BasicsOfSwitchCase{

//default is not mandatory

//default can be kept at any location not just end unlike else case of if else if block

//break is not mandatory

//if break is not present it goes to all other labels until break is reached
	
	public static void main(String... args){
		//single variable inviolved
		//only equality check
		int month = 3;
		
		switch(month){
				default: System.out.println("Default");
			
			case 1: System.out.println("January");
			//break is not mandatory
			//break;
			
				case 2: System.out.println("February");
			//break is not mandatory
			break;
			
				case 3: System.out.println("March");
			//break is not mandatory
			//if break is nt
			//break;
			
				case 4: System.out.println("April");
			//break is not mandatory
			//break;
				
				
			//default is not mandatory
			//default: System.out.println("Default");
			//break is not mandatory
			//break;
			//default: System.out.println("Default");
			
		
			
		}
		
	}
	
}