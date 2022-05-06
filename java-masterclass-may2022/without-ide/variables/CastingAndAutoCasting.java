public class CastingAndAutoCasting{

public static void main(String... args){
	//in primitive data types
	// upcasting is automatic but downcasting needs forefulness and data loss might occur
	
	int data = 23;
	
	long ddata = data;
	
	System.out.println("ddata: "+ddata);
	
	//however downcast is forceful and data loss might occur
	
	data = (int)ddata;
	
	System.out.println("data: "+data);
	
	//loss of precision
	long lanother = 2147483648l;
	int another = (int)lanother;
	
	System.out.println("another: "+another);
}
}