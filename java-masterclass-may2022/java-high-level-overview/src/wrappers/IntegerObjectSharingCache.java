package wrappers;


public class IntegerObjectSharingCache {

	public static void main(String[] args) {
		//bad way is constructor call as they keep on creating new object and have no data sharing of object
		
		//also warapper class is immutable
		Integer one = 127;
		Integer two = 127;
		
		System.out.println(one == two);
		
		//still uses cache
		Integer vaInteger = Integer.valueOf(127);
		System.out.println(vaInteger == one);
		
		//this creates forced object
		Integer integer = new Integer(127);
		System.out.println(integer == vaInteger);
		
		//in string it works does it work in integer
		Integer waah = 100 + 27;
		System.out.println(waah == one);
	}
}
