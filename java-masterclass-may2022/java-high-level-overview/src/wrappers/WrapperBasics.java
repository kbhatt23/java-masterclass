package wrappers;

public class WrapperBasics {

	public static void main(String[] args) {
		//first step is to create wrapper objects
		
		//best choie is static factory method and not constructor
		Integer wrapperInt = Integer.valueOf(23);
		Boolean wrapperBoolean = Boolean.valueOf(true);
		
		Double wrapperDouble = Double.valueOf(25.65);
		Character wrapperCharacter = Character.valueOf('f');
		System.out.println(wrapperInt);
		System.out.println(wrapperBoolean);
		System.out.println(wrapperDouble);
		System.out.println(wrapperCharacter);
		
		Integer valueOf = Integer.valueOf("19");
		System.out.println(valueOf);
		
		//numberformateception
		
		//valueOf = Integer.valueOf("not possible");
	}
}
