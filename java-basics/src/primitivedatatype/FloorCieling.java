package primitivedatatype;

public class FloorCieling {
public static void main(String[] args) {
	//by defaut int/int gives double
	int num1 = 29;
	int num2 = 10;
	int numInt = num1/num2;
	
	System.out.println("division "+numInt);
	
	double doubleNum =2.4;
	System.out.println("roundoff one"+Math.round(doubleNum));
	
	double doubleNum1 =2.7;
	System.out.println("round off two "+Math.round(doubleNum1));
	
	double doubleNum2 =2.8;
	System.out.println("floor one "+Math.floor(doubleNum2));
	
	 doubleNum2 =2.2;
	System.out.println("floor one "+Math.floor(doubleNum2));
	
	double doubleNum3 =2.8;
	System.out.println("ceil one "+Math.ceil(doubleNum3));
	
	 doubleNum2 =2.2;
	System.out.println("ceil two "+Math.ceil(doubleNum3));
}
}
