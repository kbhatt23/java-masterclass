package interfaces;
//framework dev class
public class MobilePhone implements ITelephone{
	
	@Override
	//all the overriding rules are foreced otherwise compiler will sa
	/* private */ public void powerOn() throws RuntimeException /* , Exception */{
		System.out.println("Powering ont he mobile phone");
	}
	
	public void call(String /*int*/ phoneNumber) {
		System.out.println("Calling number "+phoneNumber);
	}
}
