package primitivedatatype;

public class PrimitiveDatatTypes {
public static void main(String[] args) {
	//default is int -> 32 bit
	int k =23;
	char c ='c';
	int la = c;
	System.out.println(k + " "+ c + " "+ la);
	System.out.println("min int value "+Integer.MIN_VALUE+ " and int max value "+Integer.MAX_VALUE);
	
	long ka = 100l;
	System.out.println(ka);
	
	//default is int and default literal val is double
	//so in case datat ype can not handle it we need to type cast manually
	System.out.println(Long.MAX_VALUE);
	long longVal =9223372036854775807l ;
	
	//same for devimal numbers
	//adding f is mandaotry
	float floatNum = 23.23f;
	System.out.println(Float.MAX_VALUE);
	System.out.println(Double.MAX_VALUE);
}
}
